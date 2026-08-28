import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class dih {
   public static final Codec<dih> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> af.a($$0, 2).map($$0x -> new dih($$0x[0], $$0x[1])), $$0 -> IntStream.of($$0.h, $$0.i))
      .stable();
   public static final yw<ByteBuf, dih> b = new yw<ByteBuf, dih>() {
      public dih a(ByteBuf $$0) {
         return vu.c($$0);
      }

      public void a(ByteBuf $$0, dih $$1) {
         vu.a($$0, $$1);
      }
   };
   private static final int j = 1056;
   public static final long c = c(1875066, 1875066);
   private static final int k = (32 + ede.a.a(edf.n).c().b() + 1) * 2;
   public static final int d = jx.a(iu.f) - k;
   public static final dih e = new dih(0, 0);
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

   public dih(int $$0, int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public dih(iu $$0) {
      this.h = jx.a($$0.u());
      this.i = jx.a($$0.w());
   }

   public dih(long $$0) {
      this.h = (int)$$0;
      this.i = (int)($$0 >> 32);
   }

   public static dih a(int $$0, int $$1) {
      return new dih($$0 << 5, $$1 << 5);
   }

   public static dih b(int $$0, int $$1) {
      return new dih(($$0 << 5) + 31, ($$1 << 5) + 31);
   }

   public long a() {
      return c(this.h, this.i);
   }

   public static long c(int $$0, int $$1) {
      return (long)$$0 & 4294967295L | ((long)$$1 & 4294967295L) << 32;
   }

   public static long a(iu $$0) {
      return c(jx.a($$0.u()), jx.a($$0.w()));
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
         return !($$0 instanceof dih $$1) ? false : this.h == $$1.h && this.i == $$1.i;
      }
   }

   public int b() {
      return this.a(8);
   }

   public int c() {
      return this.b(8);
   }

   public int d() {
      return jx.c(this.h);
   }

   public int e() {
      return jx.c(this.i);
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

   public iu a(int $$0, int $$1, int $$2) {
      return new iu(this.a($$0), $$1, this.b($$2));
   }

   public int a(int $$0) {
      return jx.a(this.h, $$0);
   }

   public int b(int $$0) {
      return jx.a(this.i, $$0);
   }

   public iu c(int $$0) {
      return new iu(this.b(), $$0, this.c());
   }

   @Override
   public String toString() {
      return "[" + this.h + ", " + this.i + "]";
   }

   public iu l() {
      return new iu(this.d(), 0, this.e());
   }

   public int a(dih $$0) {
      return this.e($$0.h, $$0.i);
   }

   public int e(int $$0, int $$1) {
      return Math.max(Math.abs(this.h - $$0), Math.abs(this.i - $$1));
   }

   public int b(dih $$0) {
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

   public static Stream<dih> a(dih $$0, int $$1) {
      return a(new dih($$0.h - $$1, $$0.i - $$1), new dih($$0.h + $$1, $$0.i + $$1));
   }

   public static Stream<dih> a(final dih $$0, final dih $$1) {
      int $$2 = Math.abs($$0.h - $$1.h) + 1;
      int $$3 = Math.abs($$0.i - $$1.i) + 1;
      final int $$4 = $$0.h < $$1.h ? 1 : -1;
      final int $$5 = $$0.i < $$1.i ? 1 : -1;
      return StreamSupport.stream(new AbstractSpliterator<dih>((long)($$2 * $$3), 64) {
         @Nullable
         private dih e;

         @Override
         public boolean tryAdvance(Consumer<? super dih> $$0x) {
            if (this.e == null) {
               this.e = $$0;
            } else {
               int $$1 = this.e.h;
               int $$2 = this.e.i;
               if ($$1 == $$1.h) {
                  if ($$2 == $$1.i) {
                     return false;
                  }

                  this.e = new dih($$0.h, $$2 + $$5);
               } else {
                  this.e = new dih($$1 + $$4, $$2);
               }
            }

            $$0.accept(this.e);
            return true;
         }
      }, false);
   }
}
