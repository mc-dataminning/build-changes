import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

public class fhf implements AutoCloseable {
   private static final MemoryPool c = TracyClient.createMemoryPool("GPU Buffers");
   private final fhd d;
   private final fhe e;
   private boolean f;
   private boolean g = false;
   public final int a;
   public int b;

   public fhf(fhd $$0, fhe $$1, int $$2) {
      this.d = $$0;
      this.b = $$2;
      this.e = $$1;
      this.a = GlStateManager._glGenBuffers();
   }

   public fhf(fhd $$0, fhe $$1, ByteBuffer $$2) {
      this($$0, $$1, $$2.remaining());
      this.a($$2, 0);
   }

   public void a(int $$0) {
      if (this.f) {
         throw new IllegalStateException("Buffer already closed");
      } else {
         if (this.g) {
            c.free((long)this.a);
         }

         this.b = $$0;
         if (this.e.l) {
            this.g = false;
         } else {
            this.b();
            GlStateManager._glBufferData(this.d.h, (long)$$0, this.e.j);
            c.malloc((long)this.a, $$0);
            this.g = true;
         }
      }
   }

   public void a(ByteBuffer $$0, int $$1) {
      if (this.f) {
         throw new IllegalStateException("Buffer already closed");
      } else if (!this.e.l) {
         throw new IllegalStateException("Buffer is not writable");
      } else {
         int $$2 = $$0.remaining();
         if ($$2 + $$1 > this.b) {
            throw new IllegalArgumentException(
               "Cannot write more data than this buffer can hold (attempting to write " + $$2 + " bytes at offset " + $$1 + " to " + this.b + " size buffer)"
            );
         } else {
            this.b();
            if (this.g) {
               GlStateManager._glBufferSubData(this.d.h, $$1, $$0);
            } else if ($$1 == 0 && $$2 == this.b) {
               GlStateManager._glBufferData(this.d.h, $$0, this.e.j);
               c.malloc((long)this.a, this.b);
               this.g = true;
            } else {
               GlStateManager._glBufferData(this.d.h, (long)this.b, this.e.j);
               GlStateManager._glBufferSubData(this.d.h, $$1, $$0);
               c.malloc((long)this.a, this.b);
               this.g = true;
            }
         }
      }
   }

   @Nullable
   public fhf.a a() {
      return this.a(0, this.b);
   }

   @Nullable
   public fhf.a a(int $$0, int $$1) {
      if (this.f) {
         throw new IllegalStateException("Buffer already closed");
      } else if (!this.e.k) {
         throw new IllegalStateException("Buffer is not readable");
      } else if ($$0 + $$1 > this.b) {
         throw new IllegalArgumentException(
            "Cannot read more data than this buffer can hold (attempting to read " + $$1 + " bytes at offset " + $$0 + " from " + this.b + " size buffer)"
         );
      } else {
         this.b();
         ByteBuffer $$2 = GlStateManager._glMapBufferRange(this.d.h, $$0, $$1, 1);
         return $$2 == null ? null : new fhf.a(this.d.h, $$2);
      }
   }

   @Override
   public void close() {
      if (!this.f) {
         this.f = true;
         GlStateManager._glDeleteBuffers(this.a);
         if (this.g) {
            c.free((long)this.a);
         }
      }
   }

   public void b() {
      GlStateManager._glBindBuffer(this.d.h, this.a);
   }

   public static class a implements AutoCloseable {
      private final int a;
      private final ByteBuffer b;

      protected a(int $$0, ByteBuffer $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ByteBuffer a() {
         return this.b;
      }

      @Override
      public void close() {
         GlStateManager._glUnmapBuffer(this.a);
      }
   }
}
