import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class deh {
   public static final Codec<deh> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ae.a($$0, 2).map($$0x -> new deh($$0x[0], $$0x[1])), $$0 -> IntStream.of($$0.g, $$0.h))
      .stable();
   public static final zg<ByteBuf, deh> b = new zg<ByteBuf, deh>() {
      public deh a(ByteBuf $$0) {
         return wf.c($$0);
      }

      public void a(ByteBuf $$0, deh $$1) {
         wf.a($$0, $$1);
      }
   };
   private static final int i = 1056;
   public static final long c = c(1875066, 1875066);
   public static final deh d = new deh(0, 0);
   private static final long j = 32L;
   private static final long k = 4294967295L;
   private static final int l = 5;
   public static final int e = 32;
   private static final int m = 31;
   public static final int f = 31;
   public final int g;
   public final int h;
   private static final int n = 1664525;
   private static final int o = 1013904223;
   private static final int p = -559038737;

   public deh(int $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public deh(jh $$0) {
      this.g = kj.a($$0.u());
      this.h = kj.a($$0.w());
   }

   public deh(long $$0) {
      this.g = (int)$$0;
      this.h = (int)($$0 >> 32);
   }

   public static deh a(int $$0, int $$1) {
      return new deh($$0 << 5, $$1 << 5);
   }

   public static deh b(int $$0, int $$1) {
      return new deh(($$0 << 5) + 31, ($$1 << 5) + 31);
   }

   public long a() {
      return c(this.g, this.h);
   }

   public static long c(int $$0, int $$1) {
      return (long)$$0 & 4294967295L | ((long)$$1 & 4294967295L) << 32;
   }

   public static long a(jh $$0) {
      return c(kj.a($$0.u()), kj.a($$0.w()));
   }

   public static int a(long $$0) {
      return (int)($$0 & 4294967295L);
   }

   public static int b(long $$0) {
      return (int)($$0 >>> 32 & 4294967295L);
   }

   @Override
   public int hashCode() {
      return d(this.g, this.h);
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
         return !($$0 instanceof deh $$1) ? false : this.g == $$1.g && this.h == $$1.h;
      }
   }

   public int b() {
      return this.a(8);
   }

   public int c() {
      return this.b(8);
   }

   public int d() {
      return kj.c(this.g);
   }

   public int e() {
      return kj.c(this.h);
   }

   public int f() {
      return this.a(15);
   }

   public int g() {
      return this.b(15);
   }

   public int h() {
      return this.g >> 5;
   }

   public int i() {
      return this.h >> 5;
   }

   public int j() {
      return this.g & 31;
   }

   public int k() {
      return this.h & 31;
   }

   public jh a(int $$0, int $$1, int $$2) {
      return new jh(this.a($$0), $$1, this.b($$2));
   }

   public int a(int $$0) {
      return kj.a(this.g, $$0);
   }

   public int b(int $$0) {
      return kj.a(this.h, $$0);
   }

   public jh c(int $$0) {
      return new jh(this.b(), $$0, this.c());
   }

   @Override
   public String toString() {
      return "[" + this.g + ", " + this.h + "]";
   }

   public jh l() {
      return new jh(this.d(), 0, this.e());
   }

   public int a(deh $$0) {
      return this.e($$0.g, $$0.h);
   }

   public int e(int $$0, int $$1) {
      return Math.max(Math.abs(this.g - $$0), Math.abs(this.h - $$1));
   }

   public int b(deh $$0) {
      return this.f($$0.g, $$0.h);
   }

   public int c(long $$0) {
      return this.f(a($$0), b($$0));
   }

   private int f(int $$0, int $$1) {
      int $$2 = $$0 - this.g;
      int $$3 = $$1 - this.h;
      return $$2 * $$2 + $$3 * $$3;
   }

   public static Stream<deh> a(deh $$0, int $$1) {
      return a(new deh($$0.g - $$1, $$0.h - $$1), new deh($$0.g + $$1, $$0.h + $$1));
   }

   public static Stream<deh> a(final deh $$0, final deh $$1) {
      int $$2 = Math.abs($$0.g - $$1.g) + 1;
      int $$3 = Math.abs($$0.h - $$1.h) + 1;
      final int $$4 = $$0.g < $$1.g ? 1 : -1;
      final int $$5 = $$0.h < $$1.h ? 1 : -1;
      return StreamSupport.stream(new AbstractSpliterator<deh>((long)($$2 * $$3), 64) {
         @Nullable
         private deh e;

         @Override
         public boolean tryAdvance(Consumer<? super deh> $$0x) {
            if (this.e == null) {
               this.e = $$0;
            } else {
               int $$1 = this.e.g;
               int $$2 = this.e.h;
               if ($$1 == $$1.g) {
                  if ($$2 == $$1.h) {
                     return false;
                  }

                  this.e = new deh($$0.g, $$2 + $$5);
               } else {
                  this.e = new deh($$1 + $$4, $$2);
               }
            }

            $$0.accept(this.e);
            return true;
         }
      }, false);
   }
}
