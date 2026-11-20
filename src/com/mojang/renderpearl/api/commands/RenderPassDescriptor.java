package com.mojang.renderpearl.api.commands;

import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.pipeline.RenderPassLayout;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public record RenderPassDescriptor(
   Supplier<String> label, RenderPassLayout layout, List<RenderPassDescriptor.Attachment> attachments, RenderPass.RenderArea renderArea
) {
   public RenderPassDescriptor {
      attachments = List.copyOf(attachments);
   }

   public static RenderPassDescriptor.Builder builder(final RenderPassLayout layout) {
      return new RenderPassDescriptor.Builder(layout::name, layout);
   }

   public static RenderPassDescriptor.Builder builder(final Supplier<String> label, final RenderPassLayout layout) {
      return new RenderPassDescriptor.Builder(label, layout);
   }

   public record Attachment(GpuTextureView textureView, boolean load, boolean store, RenderPassDescriptor.Attachment.@Nullable ClearValue clearValue) {
      public record ClearValue(Vector4fc color, float depth, byte stencil) {
         public ClearValue {
            Vector4fc var4 = new Vector4f(color);
         }
      }
   }

   public static class Builder {
      private final Supplier<String> label;
      private final RenderPassLayout layout;
      private final List<RenderPassDescriptor.Attachment> attachments = new ReferenceArrayList();

      public Builder(final Supplier<String> label, final RenderPassLayout layout) {
         this.label = label;
         this.layout = layout;
      }

      public RenderPassDescriptor build(final RenderPass.RenderArea renderArea) {
         if (this.attachments.size() != this.layout.attachmentFormats().size()) {
            throw new IllegalStateException(
               "Attachment count (" + this.attachments.size() + ") does not match expectation from layout (" + this.layout.attachmentFormats().size() + ")"
            );
         } else {
            return new RenderPassDescriptor(this.label, this.layout, this.attachments, renderArea);
         }
      }

      public RenderPassDescriptor build() {
         return this.build(new RenderPass.RenderArea(this.attachments.getFirst().textureView()));
      }

      public void withAttachment(final RenderPassDescriptor.Attachment attachment) {
         int attachmentIndex = this.attachments.size();
         if (attachmentIndex >= this.layout.attachmentFormats().size()) {
            throw new IllegalStateException(
               "Cannot add another attachment, already reached expected number from layout (" + this.layout.attachmentFormats().size() + ")"
            );
         }

         GpuFormat expectedFormat = this.layout.attachmentFormats().get(attachmentIndex);
         if (attachment.textureView.texture().getFormat() != expectedFormat) {
            throw new IllegalArgumentException(
               "Attachment format " + attachment.textureView.texture().getFormat() + " does not match expected format " + expectedFormat
            );
         }

         if (attachmentIndex != 0) {
            GpuTextureView firstView = this.attachments.getFirst().textureView();
            GpuTextureView currentView = attachment.textureView();
            if (firstView.getWidth(0) != currentView.getWidth(0) || firstView.getHeight(0) != currentView.getHeight(0)) {
               throw new IllegalArgumentException("All texture views must be the same size to start a RenderPass");
            }
         }

         this.attachments.add(attachment);
      }

      public GpuTextureView withAttachment(final GpuTextureView textureView) {
         this.withAttachment(new RenderPassDescriptor.Attachment(textureView, true, true, null));
         return textureView;
      }

      public GpuTextureView withAttachment(final GpuTextureView textureView, final RenderPassDescriptor.Attachment.ClearValue clearValue) {
         this.withAttachment(new RenderPassDescriptor.Attachment(textureView, true, true, clearValue));
         return textureView;
      }

      public GpuTextureView withAttachment(final GpuTextureView textureView, final Vector4fc clearValue) {
         if (!textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot use color clear value on non-color texture");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(textureView, true, true, new RenderPassDescriptor.Attachment.ClearValue(clearValue, 0.0F, (byte)0))
         );
         return textureView;
      }

      public GpuTextureView withAttachment(final GpuTextureView textureView, final float clearValue) {
         if (textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot clear a color texture with a depth value");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(textureView, true, true, new RenderPassDescriptor.Attachment.ClearValue(new Vector4f(), clearValue, (byte)0))
         );
         return textureView;
      }

      public GpuTextureView withAttachment(final GpuTextureView textureView, final float clearValueDepth, final byte clearValueStencil) {
         if (textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot clear a color texture with a depth/stencil value");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(
               textureView, true, true, new RenderPassDescriptor.Attachment.ClearValue(new Vector4f(), clearValueDepth, clearValueStencil)
            )
         );
         return textureView;
      }

      public GpuTextureView withAttachmentDontStore(final GpuTextureView textureView, final RenderPassDescriptor.Attachment.ClearValue clearValue) {
         this.withAttachment(new RenderPassDescriptor.Attachment(textureView, true, false, clearValue));
         return textureView;
      }

      public GpuTextureView withAttachmentDontStore(final GpuTextureView textureView, final Vector4fc clearValue) {
         if (!textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot use color clear value on non-color texture");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(textureView, true, false, new RenderPassDescriptor.Attachment.ClearValue(clearValue, 0.0F, (byte)0))
         );
         return textureView;
      }

      public GpuTextureView withAttachmentDontStore(final GpuTextureView textureView, final float clearValue) {
         if (textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot clear a color texture with a depth/stencil value");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(textureView, true, false, new RenderPassDescriptor.Attachment.ClearValue(new Vector4f(), clearValue, (byte)0))
         );
         return textureView;
      }

      public GpuTextureView withAttachmentDontStore(final GpuTextureView textureView, final float clearValueDepth, final byte clearValueStencil) {
         if (textureView.texture().getFormat().hasColorAspect()) {
            throw new IllegalArgumentException("Cannot clear a color texture with a depth/stencil value");
         }

         this.withAttachment(
            new RenderPassDescriptor.Attachment(
               textureView, true, false, new RenderPassDescriptor.Attachment.ClearValue(new Vector4f(), clearValueDepth, clearValueStencil)
            )
         );
         return textureView;
      }

      public GpuTextureView withAttachmentDontLoad(final GpuTextureView textureView) {
         this.withAttachment(new RenderPassDescriptor.Attachment(textureView, false, true, null));
         return textureView;
      }

      public GpuTextureView withAttachmentDontLoadDontStore(final GpuTextureView textureView) {
         this.withAttachment(new RenderPassDescriptor.Attachment(textureView, false, false, null));
         return textureView;
      }
   }
}
