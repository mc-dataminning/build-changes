package com.mojang.renderpearl.backend.opengl;

import com.mojang.logging.LogUtils;
import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.buffers.GpuBuffer;
import com.mojang.renderpearl.api.buffers.GpuBufferSlice;
import com.mojang.renderpearl.api.buffers.TransientMemory;
import com.mojang.renderpearl.api.commands.GpuFence;
import com.mojang.renderpearl.api.commands.GpuQueryPool;
import com.mojang.renderpearl.api.commands.RenderPass;
import com.mojang.renderpearl.api.commands.RenderPassDescriptor;
import com.mojang.renderpearl.api.pipeline.IndexType;
import com.mojang.renderpearl.api.pipeline.RenderPassLayout;
import com.mojang.renderpearl.api.textures.GpuTexture;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import com.mojang.renderpearl.backend.api.CommandEncoderBackend;
import com.mojang.renderpearl.backend.api.RenderPassBackend;
import com.mojang.renderpearl.util.ScissorState;
import com.mojang.renderpearl.util.TextureViewAndSampler;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.ARBBaseInstance;
import org.lwjgl.opengl.ARBDrawIndirect;
import org.lwjgl.opengl.ARBMultiDrawIndirect;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

class GlCommandEncoder implements CommandEncoderBackend, UncheckedAutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final int MAX_SUBMITS_IN_FLIGHT = 2;
   private static final long NO_FENCE = 0L;
   private final GlDevice device;
   private final GlStateManager stateManager;
   private final GlTransientMemory transientMemory;
   private final long[] fences = new long[2];
   private long currentSubmitIndex = 2L;
   private final int readFbo;
   private final int drawFbo;
   private @Nullable GlRenderPipeline lastPipeline;
   private final List<@Nullable FrameBufferAttachment> renderPassAttachments = new ArrayList<>();

   protected GlCommandEncoder(final GlDevice device) {
      this.device = device;
      this.stateManager = device.stateManager();
      this.transientMemory = device.getDeviceInfo().features().persistentMapping()
         ? new GlTransientMemory.PersistentMapping(device, this)
         : new GlTransientMemory.Fallback(device, this);
      this.readFbo = device.directStateAccess().createFrameBufferObject();
      this.drawFbo = device.directStateAccess().createFrameBufferObject();
   }

   @Override
   public void close() {
      this.transientMemory.close();
   }

   public long currentSubmitIndex() {
      return this.currentSubmitIndex;
   }

   public int currentSubmitSlot() {
      return (int)(this.currentSubmitIndex % 2L);
   }

   @Override
   public void submit() {
      this.device.ensureCurrent();
      this.fences[this.currentSubmitSlot()] = GL33C.glFenceSync(37143, 0);
      this.currentSubmitIndex++;
      if (!this.awaitSubmit(this.currentSubmitIndex - 2L, -1L)) {
         throw new IllegalStateException("Failed to wait for frame completion");
      }

      this.transientMemory.rotate();
   }

   boolean awaitSubmit(final long index, final long timeoutNS) {
      if (this.currentSubmitIndex > index + 2L) {
         return true;
      }

      if (index == this.currentSubmitIndex) {
         if (timeoutNS == 0L) {
            return false;
         } else {
            throw new IllegalStateException("Cannot wait on a fence for the current submit");
         }
      } else {
         int submitSlot = (int)(index % 2L);
         long fence = this.fences[submitSlot];
         if (fence == 0L) {
            return true;
         }

         this.device.ensureCurrent();
         int result = GL33C.glClientWaitSync(fence, 1, timeoutNS);
         if (result == 37147) {
            return false;
         }

         if (result == 37149) {
            throw new IllegalStateException("Failed to complete GPU fence: " + GL33C.glGetError());
         }

         GL33C.glDeleteSync(this.fences[submitSlot]);
         this.fences[submitSlot] = 0L;
         return true;
      }
   }

   @Override
   public TransientMemory transientMemory() {
      return this.transientMemory;
   }

   @Override
   public RenderPassBackend createRenderPass(final RenderPassDescriptor descriptor) {
      this.device.ensureCurrent();
      this.device.debugLabels().pushDebugGroup(descriptor.label());
      this.stateManager._depthMask(true);
      this.stateManager._colorMask(15);
      GL33C.glStencilMask(-1);
      int width = descriptor.attachments().getFirst().textureView().getWidth(0);
      int height = descriptor.attachments().getFirst().textureView().getHeight(0);
      GL33C.glViewport(0, 0, width, height);
      RenderPass.RenderArea renderArea = descriptor.renderArea();
      this.stateManager._enableScissorTest();
      GL33C.glScissor(renderArea.x(), renderArea.y(), renderArea.width(), renderArea.height());
      this.renderPassAttachments.clear();

      for (RenderPassDescriptor.Attachment attachment : descriptor.attachments()) {
         this.renderPassAttachments.add((GlTextureView)attachment.textureView());
         if (attachment.clearValue() != null) {
            GpuFormat format = attachment.textureView().texture().getFormat();
            if (format.hasColorAspect()) {
               int clearFBO = this.device.frameBufferCache().getFbo(this.device.directStateAccess(), List.of((GlTextureView)attachment.textureView()), null);
               this.stateManager._glBindFramebuffer(36160, clearFBO);
               GL33C.glDrawBuffers(36064);
               Vector4fc clearColor = attachment.clearValue().color();
               GL33C.glClearColor(clearColor.x(), clearColor.y(), clearColor.z(), clearColor.w());
               GL33C.glClear(16384);
            } else {
               int clearFBO = this.device.frameBufferCache().getFbo(this.device.directStateAccess(), List.of(), (GlTextureView)attachment.textureView());
               this.stateManager._glBindFramebuffer(36160, clearFBO);
               float clearDepth = attachment.clearValue().depth();
               int clearStencil = attachment.clearValue().stencil();
               GL33C.glClearDepth(clearDepth);
               GL33C.glClearStencil(clearStencil);
               if (format.hasDepthAspect()) {
                  GL33C.glClear(256);
               }

               if (format.hasStencilAspect()) {
                  GL33C.glClear(1024);
               }
            }
         }
      }

      this.stateManager._glBindFramebuffer(36160, 0);
      this.beginSubpass(descriptor.layout(), 0);
      ScissorState scissorState = new ScissorState();
      scissorState.enable(renderArea.x(), renderArea.y(), renderArea.width(), renderArea.height());
      return new GlRenderPass(this, this.device, scissorState, descriptor.layout());
   }

   public void beginSubpass(final RenderPassLayout layout, final int subpassIndex) {
      RenderPassLayout.Subpass subpassLayout = layout.subpass(subpassIndex);
      int[] drawBuffers = new int[subpassLayout.colorAttachments().size()];
      ReferenceArrayList<FrameBufferAttachment> subpassColorAttachments = new ReferenceArrayList();
      subpassColorAttachments.size(subpassLayout.colorAttachments().size());

      for (int i = 0; i < drawBuffers.length; i++) {
         int attachment = subpassLayout.colorAttachments().getByte(i);
         if (attachment != -1) {
            drawBuffers[i] = 36064 + i;
            subpassColorAttachments.set(i, this.renderPassAttachments.get(attachment));
         } else {
            drawBuffers[i] = 0;
         }
      }

      FrameBufferAttachment depthAttachment;
      if (subpassLayout.depthStencilAttachment() != -1) {
         depthAttachment = this.renderPassAttachments.get(subpassLayout.depthStencilAttachment());
      } else {
         depthAttachment = null;
      }

      int fbo = this.device.frameBufferCache().getFbo(this.device.directStateAccess(), subpassColorAttachments, depthAttachment);
      this.stateManager._glBindFramebuffer(36160, fbo);
      GL33C.glDrawBuffers(drawBuffers);
      this.lastPipeline = null;
   }

   @Override
   public void clearColorTexture(final GpuTexture colorTexture, final Vector4fc clearColor) {
      this.device.ensureCurrent();
      GL33C.glClearColor(clearColor.x(), clearColor.y(), clearColor.z(), clearColor.w());
      this.stateManager._disableScissorTest();
      this.stateManager._colorMask(15);

      for (int i = 0; i < colorTexture.getMipLevels(); i++) {
         this.device.directStateAccess().bindFrameBufferTextures(this.drawFbo, ((GlTexture)colorTexture).id, 0, 0, i, 36160);
         GlStateManager._clear(16384);
      }

      GL33C.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      this.stateManager._glBindFramebuffer(36160, 0);
   }

   @Override
   public void clearColorAndDepthTextures(final GpuTexture colorTexture, final Vector4fc clearColor, final GpuTexture depthTexture, final double clearDepth) {
      this.device.ensureCurrent();
      this.stateManager._disableScissorTest();
      GL33C.glClearDepth(clearDepth);
      GL33C.glClearColor(clearColor.x(), clearColor.y(), clearColor.z(), clearColor.w());
      this.stateManager._depthMask(true);
      this.stateManager._colorMask(15);

      for (int i = 0; i < colorTexture.getMipLevels(); i++) {
         int fbo = this.device
            .frameBufferCache()
            .getFbo(this.device.directStateAccess(), Collections.singletonList((GlTexture)colorTexture), (GlTexture)depthTexture, i);
         this.stateManager._glBindFramebuffer(36160, fbo);
         GlStateManager._clear(16640);
      }

      this.stateManager._glBindFramebuffer(36160, 0);
   }

   @Override
   public void clearDepthTexture(final GpuTexture depthTexture, final double clearDepth) {
      this.device.ensureCurrent();
      GL33C.glClearDepth(clearDepth);
      this.stateManager._depthMask(true);
      this.stateManager._disableScissorTest();

      for (int i = 0; i < depthTexture.getMipLevels(); i++) {
         this.device.directStateAccess().bindFrameBufferTextures(this.drawFbo, 0, ((GlTexture)depthTexture).id, 0, i, 36160);
         GL33C.glDrawBuffer(0);
         GlStateManager._clear(256);
      }

      GL33C.glDrawBuffer(36064);
      GL33C.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
      this.stateManager._glBindFramebuffer(36160, 0);
   }

   @Override
   public void clearStencilTexture(final GpuTexture stencilTexture, final byte clearStencil) {
      this.device.ensureCurrent();
      GL33C.glClearStencil(clearStencil);
      this.stateManager._depthMask(true);
      this.stateManager._disableScissorTest();

      for (int i = 0; i < stencilTexture.getMipLevels(); i++) {
         this.device.directStateAccess().bindFrameBufferTextures(this.drawFbo, 0, 0, ((GlTexture)stencilTexture).id, i, 36160);
         GL33C.glDrawBuffer(0);
         GlStateManager._clear(1024);
      }

      GL33C.glDrawBuffer(36064);
      GL33C.glFramebufferTexture2D(36160, 36128, 3553, 0, 0);
      this.stateManager._glBindFramebuffer(36160, 0);
   }

   @Override
   public void writeToBuffer(final GpuBufferSlice slice, final ByteBuffer data) {
      this.device.ensureCurrent();
      GlBuffer buffer = (GlBuffer)slice.buffer();
      buffer.checkCanBeUsed();
      this.device.directStateAccess().bufferSubData(buffer.handle(), slice.offset(), data, buffer.usage());
   }

   @Override
   public void copyToBuffer(final GpuBufferSlice source, final GpuBufferSlice target) {
      this.device.ensureCurrent();
      GlBuffer sourceBuffer = (GlBuffer)source.buffer();
      GlBuffer targetBuffer = (GlBuffer)target.buffer();
      sourceBuffer.checkCanBeUsed();
      targetBuffer.checkCanBeUsed();
      this.device.directStateAccess().copyBufferSubData(sourceBuffer.handle(), targetBuffer.handle(), source.offset(), target.offset(), source.length());
   }

   @Override
   public void writeToTexture(
      final GpuTexture destination,
      final ByteBuffer source,
      final int mipLevel,
      final int depthOrLayer,
      final int destX,
      final int destY,
      final int width,
      final int height
   ) {
      this.device.ensureCurrent();
      GlStateManager.clearGlErrors();
      int target;
      if ((destination.usage() & 16) != 0) {
         target = GlConst.CUBEMAP_TARGETS[depthOrLayer % 6];
         GL33C.glBindTexture(34067, ((GlTexture)destination).id);
      } else {
         target = 3553;
         this.stateManager._bindTexture(((GlTexture)destination).id);
      }

      GL33C.glPixelStorei(3314, width);
      GL33C.glPixelStorei(3316, 0);
      GL33C.glPixelStorei(3315, 0);
      GL33C.glPixelStorei(3317, destination.getFormat().byteAlignment());
      GL33C.glTexSubImage2D(
         target, mipLevel, destX, destY, width, height, GlConst.toGlExternalId(destination.getFormat()), GlConst.toGlType(destination.getFormat()), source
      );
      int error = GL33C.glGetError();
      if (error != 0) {
         throw new IllegalStateException("Couldn't perform writeToTexture for destination texture " + destination.getLabel() + ": GL error " + error);
      }
   }

   @Override
   public void copyBufferToTexture(
      final GpuBufferSlice source,
      final int sourceX,
      final int sourceY,
      final int sourceWidth,
      final int sourceHeight,
      final GpuTexture destination,
      final int destinationX,
      final int destinationY,
      final int copyWidth,
      final int copyHeight,
      final int mipLevel,
      final int arrayLayer
   ) {
      this.device.ensureCurrent();
      GlStateManager.clearGlErrors();
      int target;
      if ((destination.usage() & 16) != 0) {
         target = GlConst.CUBEMAP_TARGETS[arrayLayer % 6];
         GL33C.glBindTexture(34067, ((GlTexture)destination).id);
      } else {
         target = 3553;
         this.stateManager._bindTexture(((GlTexture)destination).id);
      }

      int texelSize = destination.getFormat().blockSize();
      long skipTexels = sourceX + (long)sourceY * sourceWidth;
      long skipBytes = skipTexels * texelSize;
      GlBuffer sourceGlBuffer = (GlBuffer)source.buffer();
      GL33C.glBindBuffer(35052, sourceGlBuffer.handle());
      GL33C.glPixelStorei(3314, sourceWidth);
      GL33C.glPixelStorei(32878, sourceHeight);
      GL33C.glPixelStorei(3316, 0);
      GL33C.glPixelStorei(3315, 0);
      GL33C.glPixelStorei(3317, destination.getFormat().byteAlignment());
      GL33C.glTexSubImage2D(
         target,
         mipLevel,
         destinationX,
         destinationY,
         copyWidth,
         copyHeight,
         GlConst.toGlExternalId(destination.getFormat()),
         GlConst.toGlType(destination.getFormat()),
         source.offset() + skipBytes
      );
      GL33C.glBindBuffer(35052, 0);
      int error = GL33C.glGetError();
      if (error != 0) {
         throw new IllegalStateException("Couldn't perform copyBufferToTexture for destination texture " + destination.getLabel() + ": GL error " + error);
      }
   }

   @Override
   public void copyTextureToBuffer(
      final GpuTexture source, final GpuBuffer destination, final long offset, final int mipLevel, final int x, final int y, final int width, final int height
   ) {
      this.device.ensureCurrent();
      ((GlBuffer)destination).checkCanBeUsed();
      GlStateManager.clearGlErrors();
      boolean isDepth = source.getFormat().hasDepthAspect();
      int textureId = ((GlTexture)source).glId();
      this.device.directStateAccess().bindFrameBufferTextures(this.readFbo, !isDepth ? textureId : 0, isDepth ? textureId : 0, 0, mipLevel, 36008);
      GL33C.glBindBuffer(35051, ((GlBuffer)destination).handle());
      GL33C.glPixelStorei(3333, source.getFormat().byteAlignment());
      GL33C.glPixelStorei(3330, width);
      GL33C.glReadPixels(x, y, width, height, GlConst.toGlExternalId(source.getFormat()), GlConst.toGlType(source.getFormat()), offset);
      GL33C.glFramebufferTexture2D(36008, isDepth ? 36096 : 36064, 3553, 0, mipLevel);
      this.stateManager._glBindFramebuffer(36008, 0);
      GL33C.glBindBuffer(35051, 0);
      int error = GL33C.glGetError();
      if (error != 0) {
         throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + source.getLabel() + ": GL error " + error);
      }
   }

   @Override
   public void copyTextureToTexture(
      final GpuTexture source,
      final GpuTexture destination,
      final int mipLevel,
      final int destX,
      final int destY,
      final int sourceX,
      final int sourceY,
      final int width,
      final int height
   ) {
      this.device.ensureCurrent();
      GlStateManager.clearGlErrors();
      this.stateManager._disableScissorTest();
      GpuFormat srcFormat = source.getFormat();
      int sourceId = ((GlTexture)source).glId();
      int destId = ((GlTexture)destination).glId();
      boolean hasDepth = srcFormat.hasDepthAspect();
      boolean hasStencil = srcFormat.hasStencilAspect();
      this.device
         .directStateAccess()
         .bindFrameBufferTextures(this.readFbo, !hasDepth && !hasStencil ? sourceId : 0, hasDepth ? sourceId : 0, 0, hasStencil ? sourceId : 0, 0);
      this.device
         .directStateAccess()
         .bindFrameBufferTextures(this.drawFbo, !hasDepth && !hasStencil ? destId : 0, hasDepth ? destId : 0, 0, hasStencil ? destId : 0, 0);
      int bufferMask = 0;
      if (srcFormat.hasColorAspect()) {
         bufferMask |= 16384;
      }

      if (srcFormat.hasDepthAspect()) {
         bufferMask |= 256;
      }

      if (srcFormat.hasStencilAspect()) {
         bufferMask |= 1024;
      }

      this.device
         .directStateAccess()
         .blitFrameBuffers(this.readFbo, this.drawFbo, sourceX, sourceY, width, height, destX, destY, width, height, bufferMask, 9728);
      int error = GL33C.glGetError();
      if (error != 0) {
         throw new IllegalStateException(
            "Couldn't perform copyToTexture for texture " + source.getLabel() + " to " + destination.getLabel() + ": GL error " + error
         );
      }
   }

   void presentTexture(final long windowHandle, final GpuTextureView textureView, final int swapchainWidth, final int swapchainHeight) {
      this.device.makeCurrent(windowHandle);
      int destY = Math.max(0, swapchainHeight - textureView.getHeight(0));
      int copyWidth = Math.min(swapchainWidth, textureView.getWidth(0));
      int copyHeight = Math.min(swapchainHeight, textureView.getHeight(0));
      this.stateManager._disableScissorTest();
      GL33C.glViewport(0, 0, textureView.getWidth(0), textureView.getHeight(0));
      this.stateManager._depthMask(true);
      this.stateManager._colorMask(15);
      this.device.directStateAccess().bindFrameBufferTextures(this.drawFbo, ((GlTexture)textureView.texture()).glId(), 0, 0, 0, 0);
      this.device.directStateAccess().blitFrameBuffers(this.drawFbo, 0, 0, 0, copyWidth, copyHeight, 0, destY, copyWidth, copyHeight + destY, 16384, 9728);
   }

   @Override
   public GpuFence createFence() {
      return new GlFence(this);
   }

   protected void executeDraw(
      final GlRenderPass renderPass,
      final int baseVertex,
      final int firstIndex,
      final int drawCount,
      final @Nullable IndexType indexType,
      final int instanceCount,
      final int firstInstance
   ) {
      this.device.ensureCurrent();
      this.setupDraw(renderPass);
      if (indexType != null) {
         if (firstInstance > 0) {
            ARBBaseInstance.glDrawElementsInstancedBaseVertexBaseInstance(
               renderPass.pipeline.primitiveTopology(),
               drawCount,
               GlConst.toGl(indexType),
               (long)firstIndex * indexType.bytes,
               instanceCount,
               baseVertex,
               firstInstance
            );
         } else {
            GL33C.glDrawElementsInstancedBaseVertex(
               renderPass.pipeline.primitiveTopology(), drawCount, GlConst.toGl(indexType), (long)firstIndex * indexType.bytes, instanceCount, baseVertex
            );
         }
      } else if (firstInstance > 0) {
         ARBBaseInstance.glDrawArraysInstancedBaseInstance(renderPass.pipeline.primitiveTopology(), baseVertex, drawCount, instanceCount, firstInstance);
      } else {
         GL33C.glDrawArraysInstanced(renderPass.pipeline.primitiveTopology(), baseVertex, drawCount, instanceCount);
      }
   }

   public void executeDraws(
      final GlRenderPass renderPass,
      final @Nullable IndexType indexType,
      final @Nullable PointerBuffer firstIndexOffsets,
      final IntBuffer indexCounts,
      final IntBuffer vertexOffsets,
      final int drawCount
   ) {
      this.device.ensureCurrent();
      this.setupDraw(renderPass);
      if (indexType == null) {
         GL33C.nglMultiDrawArrays(renderPass.pipeline.primitiveTopology(), MemoryUtil.memAddress(vertexOffsets), MemoryUtil.memAddress(indexCounts), drawCount);
      } else {
         assert firstIndexOffsets != null;
         GL33C.nglMultiDrawElementsBaseVertex(
            renderPass.pipeline.primitiveTopology(),
            MemoryUtil.memAddress(indexCounts),
            GlConst.toGl(indexType),
            MemoryUtil.memAddress(firstIndexOffsets),
            drawCount,
            MemoryUtil.memAddress(vertexOffsets)
         );
      }
   }

   protected void executeDrawIndirect(
      final GlRenderPass renderPass, final @Nullable IndexType indexType, final GlBuffer commands, final long offset, final int drawCount
   ) {
      this.device.ensureCurrent();
      this.setupDraw(renderPass);
      GL33C.glBindBuffer(36671, commands.handle());
      if (indexType == null) {
         if (drawCount > 1) {
            ARBMultiDrawIndirect.glMultiDrawArraysIndirect(renderPass.pipeline.primitiveTopology(), offset, drawCount, 0);
         } else {
            ARBDrawIndirect.glDrawArraysIndirect(renderPass.pipeline.primitiveTopology(), offset);
         }
      } else if (drawCount > 1) {
         ARBMultiDrawIndirect.glMultiDrawElementsIndirect(renderPass.pipeline.primitiveTopology(), GlConst.toGl(indexType), offset, drawCount, 0);
      } else {
         ARBDrawIndirect.glDrawElementsIndirect(renderPass.pipeline.primitiveTopology(), GlConst.toGl(indexType), offset);
      }
   }

   private void setupDraw(final GlRenderPass renderPass) {
      if (renderPass.vertexBufferDirty) {
         renderPass.pipeline.vertexArray().bind(renderPass.vertexBuffers);
         renderPass.vertexBufferDirty = false;
      }

      if (renderPass.indexBufferDirty) {
         renderPass.indexBufferDirty = false;
         GL33C.glBindBuffer(34963, ((GlBuffer)renderPass.indexBuffer).handle());
      }

      if (this.lastPipeline != renderPass.pipeline) {
         renderPass.pipeline.bind();
         this.lastPipeline = renderPass.pipeline;
      }

      GlProgram glProgram = renderPass.pipeline.program();
      if (renderPass.pushConstantsDirty) {
         renderPass.pushConstantsDirty = false;
         Uniform.Ubo pushConstantUBO = glProgram.pushConstant();
         if (pushConstantUBO != null) {
            assert renderPass.pushConstants != null;
            GL33C.glBindBufferRange(
               35345,
               pushConstantUBO.blockBinding(),
               ((GlBuffer)renderPass.pushConstants.buffer()).handle(),
               renderPass.pushConstants.offset(),
               renderPass.pushConstants.length()
            );
         }
      }

      if (renderPass.anyUniformDirty) {
         renderPass.anyUniformDirty = false;

         label149:
         for (int i = 0; i < renderPass.dirtyUniforms.size(); i++) {
            if (renderPass.dirtyUniforms.getBoolean(i)) {
               renderPass.dirtyUniforms.set(i, false);
               Uniform dirtyUniform = glProgram.getUniform(i);
               if (dirtyUniform != null) {
                  Uniform var5 = dirtyUniform;
                  byte var6 = 0;

                  while (true) {
                     switch (SwitchBootstraps.typeSwitch<"typeSwitch",Uniform.Ubo,Uniform.Utb,Uniform.Sampler,Uniform.InputAttachment>(var5, var6)) {
                        case 0:
                           Uniform.Ubo var7 = (Uniform.Ubo)var5;
                           Uniform.Ubo var49 = var7;

                           try {
                              var50 = var49.blockBinding();
                           } catch (Throwable var19) {
                              throw new MatchException(var19.toString(), var19);
                           }

                           int var27 = var50;
                           if (true) {
                              int blockBinding = var27;
                              GpuBufferSlice var28 = (GpuBufferSlice)renderPass.uniforms.get(i);
                              GL33C.glBindBufferRange(35345, blockBinding, ((GlBuffer)var28.buffer()).handle(), var28.offset(), var28.length());
                              continue label149;
                           }

                           var6 = 1;
                           break;
                        case 1:
                           Uniform.Utb bufferView = (Uniform.Utb)var5;
                           Uniform.Utb var42 = bufferView;

                           try {
                              var42.stateManager();
                           } catch (Throwable var25) {
                              throw new MatchException(var25.toString(), var25);
                           }

                           var42 = bufferView;

                           try {
                              var44 = var42.samplerIndex();
                           } catch (Throwable var24) {
                              throw new MatchException(var24.toString(), var24);
                           }

                           int var29 = var44;
                           if (true) {
                              int samplerIndex = var29;
                              var42 = bufferView;

                              try {
                                 var46 = var42.format();
                              } catch (Throwable var23) {
                                 throw new MatchException(var23.toString(), var23);
                              }

                              GpuFormat var30 = var46;
                              GpuFormat format = var30;
                              var42 = bufferView;

                              try {
                                 var48 = var42.texture();
                              } catch (Throwable var22) {
                                 throw new MatchException(var22.toString(), var22);
                              }

                              var29 = var48;
                              if (true) {
                                 int texture = var29;
                                 this.stateManager._activeTexture(33984 + samplerIndex);
                                 GL33C.glBindTexture(35882, texture);
                                 GpuBufferSlice var32 = (GpuBufferSlice)renderPass.uniforms.get(i);
                                 GL33C.glTexBuffer(35882, GlConst.toGlInternalId(format), ((GlBuffer)var32.buffer()).handle());
                                 continue label149;
                              }
                           }

                           var6 = 2;
                           break;
                        case 2:
                           Uniform.Sampler bufferView = (Uniform.Sampler)var5;
                           Uniform.Sampler var40 = bufferView;

                           try {
                              var41 = var40.samplerIndex();
                           } catch (Throwable var21) {
                              throw new MatchException(var21.toString(), var21);
                           }

                           int var33 = var41;
                           if (true) {
                              int samplerIndex = var33;
                              TextureViewAndSampler viewAndSampler = (TextureViewAndSampler)renderPass.uniforms.get(i);
                              if (viewAndSampler != null) {
                                 GlTextureView textureView = (GlTextureView)viewAndSampler.view();
                                 this.stateManager._activeTexture(33984 + samplerIndex);
                                 GlTexture texture = textureView.texture();
                                 int target;
                                 if ((texture.usage() & 16) != 0) {
                                    target = 34067;
                                    GL33C.glBindTexture(34067, texture.id);
                                 } else {
                                    target = 3553;
                                    this.stateManager._bindTexture(texture.id);
                                 }

                                 GL33C.glBindSampler(samplerIndex, ((GlSampler)viewAndSampler.sampler()).getId());
                                 GL33C.glTexParameteri(target, 33084, textureView.baseMipLevel());
                                 GL33C.glTexParameteri(target, 33085, textureView.baseMipLevel() + textureView.mipLevels() - 1);
                              }
                              continue label149;
                           }

                           var6 = 3;
                           break;
                        case 3:
                           Uniform.InputAttachment viewAndSampler = (Uniform.InputAttachment)var5;
                           Uniform.InputAttachment var10000 = viewAndSampler;

                           try {
                              var39 = var10000.samplerIndex();
                           } catch (Throwable var20) {
                              throw new MatchException(var20.toString(), var20);
                           }

                           int textureView = var39;
                           if (true) {
                              int samplerIndex = textureView;
                              GlTextureView textureViewx = (GlTextureView)renderPass.uniforms.get(i);
                              if (textureViewx != null) {
                                 this.stateManager._activeTexture(33984 + samplerIndex);
                                 GlTexture texture = textureViewx.texture();
                                 this.stateManager._bindTexture(texture.id);
                                 GL33C.glBindSampler(samplerIndex, 0);
                                 GL33C.glTexParameteri(3553, 33084, textureViewx.baseMipLevel());
                                 GL33C.glTexParameteri(3553, 33085, textureViewx.baseMipLevel() + textureViewx.mipLevels() - 1);
                              }
                              continue label149;
                           }

                           var6 = 4;
                           break;
                        default:
                           throw new IllegalArgumentException();
                     }
                  }
               }
            }
         }
      }

      if (renderPass.scissorStateDirty) {
         renderPass.scissorStateDirty = false;
         if (renderPass.isScissorEnabled()) {
            this.stateManager._enableScissorTest();
            GL33C.glScissor(renderPass.getScissorX(), renderPass.getScissorY(), renderPass.getScissorWidth(), renderPass.getScissorHeight());
         } else {
            this.stateManager._disableScissorTest();
         }
      }
   }

   @Override
   public void submitRenderPass() {
      this.device.ensureCurrent();
      this.stateManager._glBindFramebuffer(36160, 0);
      this.device.debugLabels().popDebugGroup();
   }

   @Override
   public void writeTimestamp(final GpuQueryPool pool, final int index) {
      ((GlQueryPool)pool).writeTimestamp(index);
   }
}
