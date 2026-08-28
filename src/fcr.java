import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;
import org.slf4j.Logger;

public class fcr implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final MemoryAllocator b = MemoryUtil.getAllocator(false);
   private static final int c = 2097152;
   private static final int d = -1;
   long e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;

   public fcr(int $$0) {
      this.f = $$0;
      this.e = b.malloc((long)$$0);
      if (this.e == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
      }
   }

   public long a(int $$0) {
      int $$1 = this.g;
      int $$2 = $$1 + $$0;
      this.b($$2);
      this.g = $$2;
      return this.e + (long)$$1;
   }

   private void b(int $$0) {
      if ($$0 > this.f) {
         int $$1 = Math.min(this.f, 2097152);
         int $$2 = Math.max(this.f + $$1, $$0);
         this.c($$2);
      }
   }

   private void c(int $$0) {
      this.e = b.realloc(this.e, (long)$$0);
      a.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", this.f, $$0);
      if (this.e == 0L) {
         throw new OutOfMemoryError("Failed to resize buffer from " + this.f + " bytes to " + $$0 + " bytes");
      } else {
         this.f = $$0;
      }
   }

   @Nullable
   public fcr.a a() {
      this.f();
      int $$0 = this.h;
      int $$1 = this.g - $$0;
      if ($$1 == 0) {
         return null;
      } else {
         this.h = this.g;
         this.i++;
         return new fcr.a($$0, $$1, this.j);
      }
   }

   public void b() {
      if (this.i > 0) {
         a.warn("Clearing BufferBuilder with unused batches");
      }

      this.c();
   }

   public void c() {
      this.f();
      if (this.i > 0) {
         this.e();
         this.i = 0;
      }
   }

   boolean d(int $$0) {
      return $$0 == this.j;
   }

   void d() {
      if (--this.i <= 0) {
         this.e();
      }
   }

   private void e() {
      int $$0 = this.g - this.h;
      if ($$0 > 0) {
         MemoryUtil.memCopy(this.e + (long)this.h, this.e, (long)$$0);
      }

      this.g = $$0;
      this.h = 0;
      this.j++;
   }

   @Override
   public void close() {
      if (this.e != 0L) {
         b.free(this.e);
         this.e = 0L;
         this.j = -1;
      }
   }

   private void f() {
      if (this.e == 0L) {
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
         if (!fcr.this.d(this.d)) {
            throw new IllegalStateException("Buffer is no longer valid");
         } else {
            return MemoryUtil.memByteBuffer(fcr.this.e + (long)this.b, this.c);
         }
      }

      @Override
      public void close() {
         if (!this.e) {
            this.e = true;
            if (fcr.this.d(this.d)) {
               fcr.this.d();
            }
         }
      }
   }
}
