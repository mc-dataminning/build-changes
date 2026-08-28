import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;
import org.slf4j.Logger;

public class fiz implements AutoCloseable {
   private static final MemoryPool a = TracyClient.createMemoryPool("ByteBufferBuilder");
   private static final Logger b = LogUtils.getLogger();
   private static final MemoryAllocator c = MemoryUtil.getAllocator(false);
   private static final int d = 2097152;
   private static final int e = -1;
   long f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;

   public fiz(int $$0) {
      this.g = $$0;
      this.f = c.malloc((long)$$0);
      a.malloc(this.f, $$0);
      if (this.f == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
      }
   }

   public long a(int $$0) {
      int $$1 = this.h;
      int $$2 = $$1 + $$0;
      this.b($$2);
      this.h = $$2;
      return this.f + (long)$$1;
   }

   private void b(int $$0) {
      if ($$0 > this.g) {
         int $$1 = Math.min(this.g, 2097152);
         int $$2 = Math.max(this.g + $$1, $$0);
         this.c($$2);
      }
   }

   private void c(int $$0) {
      a.free(this.f);
      this.f = c.realloc(this.f, (long)$$0);
      a.malloc(this.f, $$0);
      b.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", this.g, $$0);
      if (this.f == 0L) {
         throw new OutOfMemoryError("Failed to resize buffer from " + this.g + " bytes to " + $$0 + " bytes");
      } else {
         this.g = $$0;
      }
   }

   @Nullable
   public fiz.a a() {
      this.f();
      int $$0 = this.i;
      int $$1 = this.h - $$0;
      if ($$1 == 0) {
         return null;
      } else {
         this.i = this.h;
         this.j++;
         return new fiz.a($$0, $$1, this.k);
      }
   }

   public void b() {
      if (this.j > 0) {
         b.warn("Clearing BufferBuilder with unused batches");
      }

      this.c();
   }

   public void c() {
      this.f();
      if (this.j > 0) {
         this.e();
         this.j = 0;
      }
   }

   boolean d(int $$0) {
      return $$0 == this.k;
   }

   void d() {
      if (--this.j <= 0) {
         this.e();
      }
   }

   private void e() {
      int $$0 = this.h - this.i;
      if ($$0 > 0) {
         MemoryUtil.memCopy(this.f + (long)this.i, this.f, (long)$$0);
      }

      this.h = $$0;
      this.i = 0;
      this.k++;
   }

   @Override
   public void close() {
      if (this.f != 0L) {
         a.free(this.f);
         c.free(this.f);
         this.f = 0L;
         this.k = -1;
      }
   }

   private void f() {
      if (this.f == 0L) {
         throw new IllegalStateException("Buffer has been freed");
      }
   }

   public class a implements AutoCloseable {
      private final int b;
      private final int c;
      private final int d;
      private boolean e;

      a(final int $$1, final int $$2, final int $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ByteBuffer a() {
         if (!fiz.this.d(this.d)) {
            throw new IllegalStateException("Buffer is no longer valid");
         } else {
            return MemoryUtil.memByteBuffer(fiz.this.f + (long)this.b, this.c);
         }
      }

      @Override
      public void close() {
         if (!this.e) {
            this.e = true;
            if (fiz.this.d(this.d)) {
               fiz.this.d();
            }
         }
      }
   }
}
