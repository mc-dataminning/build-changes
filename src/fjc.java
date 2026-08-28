import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjc extends GpuBuffer {
   protected static final MemoryPool a = TracyClient.createMemoryPool("GPU Buffers");
   protected boolean b;
   protected boolean c = false;
   @Nullable
   protected final Supplier<String> d;
   protected final int e;

   protected fjc(fjf $$0, @Nullable Supplier<String> $$1, BufferType $$2, BufferUsage $$3, int $$4, int $$5) {
      super($$2, $$3, $$4);
      this.d = $$1;
      this.e = $$5;
      if ($$3.isReadable()) {
         GlStateManager._glBindBuffer(GlConst.toGl($$2), $$5);
         GlStateManager._glBufferData(GlConst.toGl($$2), (long)$$4, GlConst.toGl($$3));
         a.malloc((long)$$5, $$4);
         this.c = true;
         $$0.a(this);
      }
   }

   protected void a() {
      if (!this.c) {
         GlStateManager._glBindBuffer(GlConst.toGl(this.type()), this.e);
         GlStateManager._glBindBuffer(GlConst.toGl(this.type()), 0);
      }
   }

   @Override
   public boolean isClosed() {
      return this.b;
   }

   @Override
   public void close() {
      if (!this.b) {
         this.b = true;
         GlStateManager._glDeleteBuffers(this.e);
         if (this.c) {
            a.free((long)this.e);
         }
      }
   }

   public static class a implements GpuBuffer.ReadView {
      private final int a;
      private final ByteBuffer b;

      protected a(int $$0, ByteBuffer $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ByteBuffer data() {
         return this.b;
      }

      @Override
      public void close() {
         GlStateManager._glUnmapBuffer(this.a);
      }
   }
}
