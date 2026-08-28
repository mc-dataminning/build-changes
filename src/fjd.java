import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.opengl.GL11;
import org.slf4j.Logger;

public class fjd implements CommandEncoder {
   private static final Logger a = LogUtils.getLogger();
   private final fjg b;
   private final int c;
   private final int d;
   @Nullable
   private RenderPipeline e;
   private boolean f;
   @Nullable
   private fjh g;

   protected fjd(fjg $$0) {
      this.b = $$0;
      this.c = $$0.b().a();
      this.d = $$0.b().a();
   }

   @Override
   public RenderPass createRenderPass(GpuTexture $$0, OptionalInt $$1) {
      return this.createRenderPass($$0, $$1, null, OptionalDouble.empty());
   }

   @Override
   public RenderPass createRenderPass(GpuTexture $$0, OptionalInt $$1, @Nullable GpuTexture $$2, OptionalDouble $$3) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         if ($$3.isPresent() && $$2 == null) {
            a.warn("Depth clear value was provided but no depth texture is being used");
         }

         if ($$0.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
         } else if ($$2 != null && $$2.isClosed()) {
            throw new IllegalStateException("Depth texture is closed");
         } else {
            this.f = true;
            int $$4 = ((fjl)$$0).a(this.b.b(), $$2);
            GlStateManager._glBindFramebuffer(36160, $$4);
            int $$5 = 0;
            if ($$1.isPresent()) {
               int $$6 = $$1.getAsInt();
               GL11.glClearColor(ayh.j($$6), ayh.k($$6), ayh.l($$6), ayh.i($$6));
               $$5 |= 16384;
            }

            if ($$2 != null && $$3.isPresent()) {
               GL11.glClearDepth($$3.getAsDouble());
               $$5 |= 256;
            }

            if ($$5 != 0) {
               GlStateManager._disableScissorTest();
               GlStateManager._depthMask(true);
               GlStateManager._colorMask(true, true, true, true);
               GlStateManager._clear($$5);
            }

            GlStateManager._viewport(0, 0, $$0.getWidth(0), $$0.getHeight(0));
            this.e = null;
            return new fji(this, $$2 != null);
         }
      }
   }

   @Override
   public void clearColorTexture(GpuTexture $$0, int $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if (!$$0.getFormat().hasColorAspect()) {
         throw new IllegalStateException("Trying to clear a non-color texture as color");
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Color texture is closed");
      } else {
         this.b.b().a(this.d, ((fjl)$$0).a, 0, 0, 36160);
         GL11.glClearColor(ayh.j($$1), ayh.k($$1), ayh.l($$1), ayh.i($$1));
         GlStateManager._disableScissorTest();
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16384);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void clearColorAndDepthTextures(GpuTexture $$0, int $$1, GpuTexture $$2, double $$3) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if (!$$0.getFormat().hasColorAspect()) {
         throw new IllegalStateException("Trying to clear a non-color texture as color");
      } else if (!$$2.getFormat().hasDepthAspect()) {
         throw new IllegalStateException("Trying to clear a non-depth texture as depth");
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Color texture is closed");
      } else if ($$2.isClosed()) {
         throw new IllegalStateException("Depth texture is closed");
      } else {
         int $$4 = ((fjl)$$0).a(this.b.b(), $$2);
         GlStateManager._glBindFramebuffer(36160, $$4);
         GlStateManager._disableScissorTest();
         GL11.glClearDepth($$3);
         GL11.glClearColor(ayh.j($$1), ayh.k($$1), ayh.l($$1), ayh.i($$1));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void clearDepthTexture(GpuTexture $$0, double $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if (!$$0.getFormat().hasDepthAspect()) {
         throw new IllegalStateException("Trying to clear a non-depth texture as depth");
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Depth texture is closed");
      } else {
         this.b.b().a(this.d, 0, ((fjl)$$0).a, 0, 36160);
         GL11.glDrawBuffer(0);
         GL11.glClearDepth($$1);
         GlStateManager._depthMask(true);
         GlStateManager._disableScissorTest();
         GlStateManager._clear(256);
         GL11.glDrawBuffer(36064);
         GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void writeToBuffer(GpuBuffer $$0, ByteBuffer $$1, int $$2) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         fjc $$3 = (fjc)$$0;
         if ($$3.b) {
            throw new IllegalStateException("Buffer already closed");
         } else if (!$$3.usage().isWritable()) {
            throw new IllegalStateException("Buffer is not writable");
         } else {
            int $$4 = $$1.remaining();
            if ($$4 + $$2 > $$3.size) {
               throw new IllegalArgumentException(
                  "Cannot write more data than this buffer can hold (attempting to write "
                     + $$4
                     + " bytes at offset "
                     + $$2
                     + " to "
                     + $$3.size
                     + " size buffer)"
               );
            } else {
               GlStateManager._glBindBuffer(GlConst.toGl($$3.type()), $$3.e);
               if ($$3.c) {
                  GlStateManager._glBufferSubData(GlConst.toGl($$3.type()), $$2, $$1);
               } else if ($$2 == 0 && $$4 == $$3.size) {
                  GlStateManager._glBufferData(GlConst.toGl($$3.type()), $$1, GlConst.toGl($$3.usage()));
                  fjc.a.malloc((long)$$3.e, $$3.size);
                  $$3.c = true;
                  this.b.a().a($$3);
               } else {
                  GlStateManager._glBufferData(GlConst.toGl($$3.type()), (long)$$3.size, GlConst.toGl($$3.usage()));
                  GlStateManager._glBufferSubData(GlConst.toGl($$3.type()), $$2, $$1);
                  fjc.a.malloc((long)$$3.e, $$3.size);
                  $$3.c = true;
                  this.b.a().a($$3);
               }
            }
         }
      }
   }

   @Override
   public GpuBuffer.ReadView readBuffer(GpuBuffer $$0) {
      return this.readBuffer($$0, 0, $$0.size());
   }

   @Override
   public GpuBuffer.ReadView readBuffer(GpuBuffer $$0, int $$1, int $$2) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         fjc $$3 = (fjc)$$0;
         if ($$3.b) {
            throw new IllegalStateException("Buffer already closed");
         } else if (!$$3.usage().isReadable()) {
            throw new IllegalStateException("Buffer is not readable");
         } else if ($$1 + $$2 > $$3.size) {
            throw new IllegalArgumentException(
               "Cannot read more data than this buffer can hold (attempting to read " + $$2 + " bytes at offset " + $$1 + " from " + $$3.size + " size buffer)"
            );
         } else {
            GlStateManager.clearGlErrors();
            GlStateManager._glBindBuffer(GlConst.toGl($$3.type()), $$3.e);
            ByteBuffer $$4 = GlStateManager._glMapBufferRange(GlConst.toGl($$3.type()), $$1, $$2, 1);
            if ($$4 == null) {
               throw new IllegalStateException("Can't read buffer, opengl error " + GlStateManager._getError());
            } else {
               return new fjc.a(GlConst.toGl($$3.type()), $$4);
            }
         }
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, fkf $$1) {
      int $$2 = $$0.getWidth(0);
      int $$3 = $$0.getHeight(0);
      if ($$1.a() != $$2 || $$1.b() != $$3) {
         throw new IllegalArgumentException("Cannot replace texture of size " + $$2 + "x" + $$3 + " with image of size " + $$1.a() + "x" + $$1.b());
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Destination texture is closed");
      } else {
         this.writeToTexture($$0, $$1, 0, 0, 0, $$2, $$3, 0, 0);
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, fkf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$2 >= 0 && $$2 < $$0.getMipLevels()) {
         if ($$7 + $$5 > $$1.a() || $$8 + $$6 > $$1.b()) {
            throw new IllegalArgumentException(
               "Copy source (" + $$1.a() + "x" + $$1.b() + ") is not large enough to read a rectangle of " + $$5 + "x" + $$6 + " from " + $$7 + "x" + $$8
            );
         } else if ($$3 + $$5 > $$0.getWidth($$2) || $$4 + $$6 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$5
                  + "x"
                  + $$6
                  + ") is not large enough to write a rectangle of "
                  + $$5
                  + "x"
                  + $$6
                  + " at "
                  + $$3
                  + "x"
                  + $$4
                  + " (at mip level "
                  + $$2
                  + ")"
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else {
            GlStateManager._bindTexture(((fjl)$$0).a);
            GlStateManager._pixelStore(3314, $$1.a());
            GlStateManager._pixelStore(3316, $$7);
            GlStateManager._pixelStore(3315, $$8);
            GlStateManager._pixelStore(3317, $$1.c().a());
            GlStateManager._texSubImage2D(3553, $$2, $$3, $$4, $$5, $$6, GlConst.toGl($$1.c()), 5121, $$1.h());
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, IntBuffer $$1, fkf.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$3 >= 0 && $$3 < $$0.getMipLevels()) {
         if ($$6 * $$7 > $$1.remaining()) {
            throw new IllegalArgumentException(
               "Copy would overrun the source buffer (remaining length of " + $$1.remaining() + ", but copy is " + $$6 + "x" + $$7 + ")"
            );
         } else if ($$4 + $$6 > $$0.getWidth($$3) || $$5 + $$7 > $$0.getHeight($$3)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$0.getWidth($$3)
                  + "x"
                  + $$0.getHeight($$3)
                  + ") is not large enough to write a rectangle of "
                  + $$6
                  + "x"
                  + $$7
                  + " at "
                  + $$4
                  + "x"
                  + $$5
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else {
            GlStateManager._bindTexture(((fjl)$$0).a);
            GlStateManager._pixelStore(3314, $$6);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, $$2.a());
            GlStateManager._texSubImage2D(3553, $$3, $$4, $$5, $$6, $$7, GlConst.toGl($$2), 5121, $$1);
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, int $$2, Runnable $$3, int $$4) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         this.copyTextureToBuffer($$0, $$1, $$2, $$3, $$4, 0, 0, $$0.getWidth($$4), $$0.getHeight($$4));
      }
   }

   @Override
   public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, int $$2, Runnable $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$4 >= 0 && $$4 < $$0.getMipLevels()) {
         if ($$0.getWidth($$4) * $$0.getHeight($$4) * $$0.getFormat().pixelSize() + $$2 > $$1.size()) {
            throw new IllegalArgumentException(
               "Buffer of size "
                  + $$1.size()
                  + " is not large enough to hold "
                  + $$7
                  + "x"
                  + $$8
                  + " pixels ("
                  + $$0.getFormat().pixelSize()
                  + " bytes each) starting from offset "
                  + $$2
            );
         } else if ($$1.type() != BufferType.PIXEL_PACK) {
            throw new IllegalArgumentException("Buffer of type " + $$1.type() + " cannot be used to retrieve a texture");
         } else if ($$5 + $$7 > $$0.getWidth($$4) || $$6 + $$8 > $$0.getHeight($$4)) {
            throw new IllegalArgumentException(
               "Copy source texture ("
                  + $$0.getWidth($$4)
                  + "x"
                  + $$0.getHeight($$4)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " from "
                  + $$5
                  + ","
                  + $$6
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if ($$1.isClosed()) {
            throw new IllegalStateException("Destination buffer is closed");
         } else {
            GlStateManager.clearGlErrors();
            this.b.b().a(this.c, ((fjl)$$0).b(), 0, $$4, 36008);
            GlStateManager._glBindBuffer(GlConst.toGl($$1.type()), ((fjc)$$1).e);
            GlStateManager._pixelStore(3330, $$7);
            GlStateManager._readPixels($$5, $$6, $$7, $$8, GlConst.toGlExternalId($$0.getFormat()), GlConst.toGlType($$0.getFormat()), (long)$$2);
            RenderSystem.queueFencedTask($$3);
            GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, 0, $$4);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glBindBuffer(GlConst.toGl($$1.type()), 0);
            int $$9 = GlStateManager._getError();
            if ($$9 != 0) {
               throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + $$0.getLabel() + ": GL error " + $$9);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$4 + ", must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void copyTextureToTexture(GpuTexture $$0, GpuTexture $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$2 >= 0 && $$2 < $$0.getMipLevels() && $$2 < $$1.getMipLevels()) {
         if ($$3 + $$7 > $$1.getWidth($$2) || $$4 + $$8 > $$1.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$1.getWidth($$2)
                  + "x"
                  + $$1.getHeight($$2)
                  + ") is not large enough to write a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$3
                  + "x"
                  + $$4
            );
         } else if ($$5 + $$7 > $$0.getWidth($$2) || $$6 + $$8 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Source texture ("
                  + $$0.getWidth($$2)
                  + "x"
                  + $$0.getHeight($$2)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$5
                  + "x"
                  + $$6
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if ($$1.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else {
            GlStateManager.clearGlErrors();
            GlStateManager._disableScissorTest();
            boolean $$9 = $$0.getFormat().hasDepthAspect();
            int $$10 = ((fjl)$$0).b();
            int $$11 = ((fjl)$$1).b();
            this.b.b().a(this.c, $$9 ? 0 : $$10, $$9 ? $$10 : 0, 0, 0);
            this.b.b().a(this.d, $$9 ? 0 : $$11, $$9 ? $$11 : 0, 0, 0);
            this.b.b().a(this.c, this.d, $$5, $$6, $$7, $$8, $$3, $$4, $$7, $$8, $$9 ? 256 : 16384, 9728);
            int $$12 = GlStateManager._getError();
            if ($$12 != 0) {
               throw new IllegalStateException("Couldn't perform copyToTexture for texture " + $$0.getLabel() + " to " + $$1.getLabel() + ": GL error " + $$12);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels() + " and < " + $$1.getMipLevels());
      }
   }

   @Override
   public void presentTexture(GpuTexture $$0) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (!$$0.getFormat().hasColorAspect()) {
         throw new IllegalStateException("Cannot present a non-color texture!");
      } else {
         GlStateManager._disableScissorTest();
         GlStateManager._viewport(0, 0, $$0.getWidth(0), $$0.getHeight(0));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         this.b.b().a(this.d, ((fjl)$$0).b(), 0, 0, 0);
         this.b.b().a(this.d, 0, 0, 0, $$0.getWidth(0), $$0.getHeight(0), 0, 0, $$0.getWidth(0), $$0.getHeight(0), 16384, 9728);
      }
   }

   protected void a(fji $$0, Collection<RenderPass.a> $$1, @Nullable GpuBuffer $$2, @Nullable VertexFormat.a $$3) {
      if (this.a($$0)) {
         if ($$3 == null) {
            $$3 = VertexFormat.a.a;
         }

         for (RenderPass.a $$4 : $$1) {
            VertexFormat.a $$5 = $$4.d() == null ? $$3 : $$4.d();
            $$0.setIndexBuffer($$4.c() == null ? $$2 : $$4.c(), $$5);
            $$0.setVertexBuffer($$4.a(), $$4.b());
            if (fji.b) {
               if ($$0.e == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if ($$0.e.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }

               if ($$0.d[0] == null) {
                  throw new IllegalStateException("Missing vertex buffer at slot 0");
               }

               if ($$0.d[0].isClosed()) {
                  throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
               }
            }

            Consumer<RenderPass.b> $$6 = $$4.g();
            if ($$6 != null) {
               $$6.accept(($$1x, $$2x) -> {
                  fjm $$3x = $$0.c.b().a($$1x);
                  if ($$3x != null) {
                     $$3x.a($$2x);
                     $$3x.c();
                  }
               });
            }

            this.a($$0, $$4.e(), $$4.f(), $$5, $$0.c);
         }
      }
   }

   protected void a(fji $$0, int $$1, int $$2, @Nullable VertexFormat.a $$3) {
      if (this.a($$0)) {
         if (fji.b) {
            if ($$3 != null) {
               if ($$0.e == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if ($$0.e.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }
            }

            if ($$0.d[0] == null) {
               throw new IllegalStateException("Missing vertex buffer at slot 0");
            }

            if ($$0.d[0].isClosed()) {
               throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
            }
         }

         this.a($$0, $$1, $$2, $$3, $$0.c);
      }
   }

   private void a(fji $$0, int $$1, int $$2, @Nullable VertexFormat.a $$3, fjj $$4) {
      this.b.c().a($$4.a().getVertexFormat(), (fjc)$$0.d[0]);
      if ($$3 != null) {
         GlStateManager._glBindBuffer(34963, ((fjc)$$0.e).e);
         GlStateManager._drawElements(GlConst.toGl($$4.a().getVertexFormatMode()), $$2, GlConst.toGl($$3), (long)$$1 * (long)$$3.c);
      } else {
         GlStateManager._drawArrays(GlConst.toGl($$4.a().getVertexFormatMode()), $$1, $$2);
      }
   }

   private boolean a(fji $$0) {
      if (fji.b) {
         if ($$0.c == null) {
            throw new IllegalStateException("Can't draw without a render pipeline");
         }

         if ($$0.c.b() == fjh.b) {
            throw new IllegalStateException("Pipeline contains invalid shader program");
         }

         for (RenderPipeline.UniformDescription $$1 : $$0.c.a().getUniforms()) {
            Object $$2 = $$0.h.get($$1.name());
            if ($$2 == null && !fjh.a.contains($$1.name())) {
               throw new IllegalStateException("Missing uniform " + $$1.name() + " (should be " + $$1.type() + ")");
            }
         }

         for (String $$3 : $$0.c.b().e()) {
            if (!$$0.i.containsKey($$3)) {
               throw new IllegalStateException("Missing sampler " + $$3);
            }

            if ($$0.i.get($$3).isClosed()) {
               throw new IllegalStateException("Sampler " + $$3 + " has been closed!");
            }
         }

         if ($$0.c.a().wantsDepthTexture() && !$$0.a()) {
            a.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", $$0.c.a().getLocation());
         }
      } else if ($$0.c == null || $$0.c.b() == fjh.b) {
         return false;
      }

      RenderPipeline $$4 = $$0.c.a();
      fjh $$5 = $$0.c.b();

      for (fjm $$6 : $$5.f()) {
         if ($$0.j.contains($$6.a())) {
            Object $$7 = $$0.h.get($$6.a());
            if ($$7 instanceof int[]) {
               $$5.b($$6.a()).a((int[])$$7);
            } else if ($$7 instanceof float[]) {
               $$5.b($$6.a()).a((float[])$$7);
            } else if ($$7 != null) {
               throw new IllegalStateException("Unknown uniform type - expected " + $$6.b() + ", found " + $$7);
            }
         }
      }

      $$0.j.clear();
      this.a($$4);
      boolean $$8 = this.g != $$5;
      if ($$8) {
         GlStateManager._glUseProgram($$5.b());
         this.g = $$5;
      }

      IntList $$9 = $$5.d();

      for (int $$10 = 0; $$10 < $$5.e().size(); $$10++) {
         String $$11 = $$5.e().get($$10);
         fjl $$12 = (fjl)$$0.i.get($$11);
         if ($$12 != null) {
            if ($$8 || $$0.k.contains($$11)) {
               int $$13 = $$9.getInt($$10);
               fjm.b($$13, $$10);
               GlStateManager._activeTexture(33984 + $$10);
            }

            GlStateManager._bindTexture($$12.b());
            $$12.a();
         }
      }

      fki $$14 = fqq.Q() == null ? null : fqq.Q().aO();
      $$5.a(
         $$4.getVertexFormatMode(),
         RenderSystem.getModelViewMatrix(),
         RenderSystem.getProjectionMatrix(),
         $$14 == null ? 0.0F : (float)$$14.k(),
         $$14 == null ? 0.0F : (float)$$14.l()
      );

      for (fjm $$15 : $$5.f()) {
         $$15.c();
      }

      if ($$0.g.isEnabled()) {
         GlStateManager._enableScissorTest();
         GlStateManager._scissorBox($$0.g.getX(), $$0.g.getY(), $$0.g.getWidth(), $$0.g.getHeight());
      } else {
         GlStateManager._disableScissorTest();
      }

      return true;
   }

   private void a(RenderPipeline $$0) {
      if (this.e != $$0) {
         this.e = $$0;
         if ($$0.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc(GlConst.toGl($$0.getDepthTestFunction()));
         } else {
            GlStateManager._disableDepthTest();
         }

         if ($$0.isCull()) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if ($$0.getBlendFunction().isPresent()) {
            GlStateManager._enableBlend();
            BlendFunction $$1 = $$0.getBlendFunction().get();
            GlStateManager._blendFuncSeparate(
               GlConst.toGl($$1.sourceColor()), GlConst.toGl($$1.destColor()), GlConst.toGl($$1.sourceAlpha()), GlConst.toGl($$1.destAlpha())
            );
         } else {
            GlStateManager._disableBlend();
         }

         GlStateManager._polygonMode(1032, GlConst.toGl($$0.getPolygonMode()));
         GlStateManager._depthMask($$0.isWriteDepth());
         GlStateManager._colorMask($$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteAlpha());
         if ($$0.getDepthBiasConstant() == 0.0F && $$0.getDepthBiasScaleFactor() == 0.0F) {
            GlStateManager._disablePolygonOffset();
         } else {
            GlStateManager._polygonOffset($$0.getDepthBiasScaleFactor(), $$0.getDepthBiasConstant());
            GlStateManager._enablePolygonOffset();
         }

         switch ($$0.getColorLogic()) {
            case NONE:
               GlStateManager._disableColorLogicOp();
               break;
            case OR_REVERSE:
               GlStateManager._enableColorLogicOp();
               GlStateManager._logicOp(5387);
         }
      }
   }

   public void a() {
      this.f = false;
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   protected fjg b() {
      return this.b;
   }
}
