import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fit extends fig {
   protected static final MemoryPool b = TracyClient.createMemoryPool("GPU Buffers");
   protected boolean c;
   protected boolean d = false;
   @Nullable
   protected final Supplier<String> e;
   protected final int f;

   protected fit(fiw $$0, @Nullable Supplier<String> $$1, fie $$2, fif $$3, int $$4, int $$5) {
      super($$2, $$3, $$4);
      this.e = $$1;
      this.f = $$5;
      if ($$3.a()) {
         GlStateManager._glBindBuffer(GlConst.toGl($$2), $$5);
         GlStateManager._glBufferData(GlConst.toGl($$2), (long)$$4, GlConst.toGl($$3));
         b.malloc((long)$$5, $$4);
         this.d = true;
         $$0.a(this);
      }
   }

   protected void d() {
      if (!this.d) {
         GlStateManager._glBindBuffer(GlConst.toGl(this.b()), this.f);
         GlStateManager._glBindBuffer(GlConst.toGl(this.b()), 0);
      }
   }

   @Override
   public void close() {
      if (!this.c) {
         this.c = true;
         GlStateManager._glDeleteBuffers(this.f);
         if (this.d) {
            b.free((long)this.f);
         }
      }
   }

   public static class a implements fig.a {
      private final int a;
      private final ByteBuffer b;

      protected a(int $$0, ByteBuffer $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ByteBuffer a() {
         return this.b;
      }

      @Override
      public void close() {
         GlStateManager._glUnmapBuffer(this.a);
      }
   }
}
