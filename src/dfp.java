import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class dfp {
   public static final Codec<dfp> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> af.a($$0, 2).map($$0x -> new dfp($$0x[0], $$0x[1])), $$0 -> IntStream.of($$0.h, $$0.i))
      .stable();
   public static final yn<ByteBuf, dfp> b = new yn<ByteBuf, dfp>() {
      public dfp a(ByteBuf $$0) {
         return vl.c($$0);
      }

      public void a(ByteBuf $$0, dfp $$1) {
         vl.a($$0, $$1);
      }
   };
   private static final int j = 1056;
   public static final long c = c(1875066, 1875066);
   private static final int k = (32 + dzt.a.a(dzu.n).c().b() + 1) * 2;
   public static final int d = kk.a(ji.f) - k;
   public static final dfp e = new dfp(0, 0);
   private static final long l = 32L;
   private static final long m = 4294967295L;
   private static final int n = 5;
   public static final int f = 32;
   private static final int o = 31;
   public static final int g = 31;
   public final int h;
   public final int i;
   private static final int p = 1664525;
   private static final int q = 1013904223;
   private static final int r = -559038737;

   public dfp(int $$0, int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public dfp(ji $$0) {
      this.h = kk.a($$0.u());
      this.i = kk.a($$0.w());
   }

   public dfp(long $$0) {
      this.h = (int)$$0;
      this.i = (int)($$0 >> 32);
   }

   public static dfp a(int $$0, int $$1) {
      return new dfp($$0 << 5, $$1 << 5);
   }

   public static dfp b(int $$0, int $$1) {
      return new dfp(($$0 << 5) + 31, ($$1 << 5) + 31);
   }

   public long a() {
      return c(this.h, this.i);
   }

   public static long c(int $$0, int $$1) {
      return (long)$$0 & 4294967295L | ((long)$$1 & 4294967295L) << 32;
   }

   public static long a(ji $$0) {
      return c(kk.a($$0.u()), kk.a($$0.w()));
   }

   public static int a(long $$0) {
      return (int)($$0 & 4294967295L);
   }

   public static int b(long $$0) {
      return (int)($$0 >>> 32 & 4294967295L);
   }

   @Override
   public int hashCode() {
      return d(this.h, this.i);
   }

   public static int d(int $$0, int $$1) {
      int $$2 = 1664525 * $$0 + 1013904223;
      int $$3 = 1664525 * ($$1 ^ -559038737) + 1013904223;
      return $$2 ^ $$3;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dfp $$1) ? false : this.h == $$1.h && this.i == $$1.i;
      }
   }

   public int b() {
      return this.a(8);
   }

   public int c() {
      return this.b(8);
   }

   public int d() {
      return kk.c(this.h);
   }

   public int e() {
      return kk.c(this.i);
   }

   public int f() {
      return this.a(15);
   }

   public int g() {
      return this.b(15);
   }

   public int h() {
      return this.h >> 5;
   }

   public int i() {
      return this.i >> 5;
   }

   public int j() {
      return this.h & 31;
   }

   public int k() {
      return this.i & 31;
   }

   public ji a(int $$0, int $$1, int $$2) {
      return new ji(this.a($$0), $$1, this.b($$2));
   }

   public int a(int $$0) {
      return kk.a(this.h, $$0);
   }

   public int b(int $$0) {
      return kk.a(this.i, $$0);
   }

   public ji c(int $$0) {
      return new ji(this.b(), $$0, this.c());
   }

   @Override
   public String toString() {
      return "[" + this.h + ", " + this.i + "]";
   }

   public ji l() {
      return new ji(this.d(), 0, this.e());
   }

   public int a(dfp $$0) {
      return this.e($$0.h, $$0.i);
   }

   public int e(int $$0, int $$1) {
      return Math.max(Math.abs(this.h - $$0), Math.abs(this.i - $$1));
   }

   public int b(dfp $$0) {
      return this.f($$0.h, $$0.i);
   }

   public int c(long $$0) {
      return this.f(a($$0), b($$0));
   }

   private int f(int $$0, int $$1) {
      int $$2 = $$0 - this.h;
      int $$3 = $$1 - this.i;
      return $$2 * $$2 + $$3 * $$3;
   }

   public static Stream<dfp> a(dfp $$0, int $$1) {
      return a(new dfp($$0.h - $$1, $$0.i - $$1), new dfp($$0.h + $$1, $$0.i + $$1));
   }

   public static Stream<dfp> a(final dfp $$0, final dfp $$1) {
      int $$2 = Math.abs($$0.h - $$1.h) + 1;
      int $$3 = Math.abs($$0.i - $$1.i) + 1;
      final int $$4 = $$0.h < $$1.h ? 1 : -1;
      final int $$5 = $$0.i < $$1.i ? 1 : -1;
      return StreamSupport.stream(new AbstractSpliterator<dfp>((long)($$2 * $$3), 64) {
         @Nullable
         private dfp e;

         @Override
         public boolean tryAdvance(Consumer<? super dfp> $$0x) {
            if (this.e == null) {
               this.e = $$0;
            } else {
               int $$1 = this.e.h;
               int $$2 = this.e.i;
               if ($$1 == $$1.h) {
                  if ($$2 == $$1.i) {
                     return false;
                  }

                  this.e = new dfp($$0.h, $$2 + $$5);
               } else {
                  this.e = new dfp($$1 + $$4, $$2);
               }
            }

            $$0.accept(this.e);
            return true;
         }
      }, false);
   }
}
