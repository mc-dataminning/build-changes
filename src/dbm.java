import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class dbm {
   private static final int g = 1056;
   public static final long a = c(1875066, 1875066);
   public static final dbm b = new dbm(0, 0);
   private static final long h = 32L;
   private static final long i = 4294967295L;
   private static final int j = 5;
   public static final int c = 32;
   private static final int k = 31;
   public static final int d = 31;
   public final int e;
   public final int f;
   private static final int l = 1664525;
   private static final int m = 1013904223;
   private static final int n = -559038737;

   public dbm(int $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public dbm(ja $$0) {
      this.e = kc.a($$0.u());
      this.f = kc.a($$0.w());
   }

   public dbm(long $$0) {
      this.e = (int)$$0;
      this.f = (int)($$0 >> 32);
   }

   public static dbm a(int $$0, int $$1) {
      return new dbm($$0 << 5, $$1 << 5);
   }

   public static dbm b(int $$0, int $$1) {
      return new dbm(($$0 << 5) + 31, ($$1 << 5) + 31);
   }

   public long a() {
      return c(this.e, this.f);
   }

   public static long c(int $$0, int $$1) {
      return (long)$$0 & 4294967295L | ((long)$$1 & 4294967295L) << 32;
   }

   public static long a(ja $$0) {
      return c(kc.a($$0.u()), kc.a($$0.w()));
   }

   public static int a(long $$0) {
      return (int)($$0 & 4294967295L);
   }

   public static int b(long $$0) {
      return (int)($$0 >>> 32 & 4294967295L);
   }

   @Override
   public int hashCode() {
      return d(this.e, this.f);
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
         return !($$0 instanceof dbm $$1) ? false : this.e == $$1.e && this.f == $$1.f;
      }
   }

   public int b() {
      return this.a(8);
   }

   public int c() {
      return this.b(8);
   }

   public int d() {
      return kc.c(this.e);
   }

   public int e() {
      return kc.c(this.f);
   }

   public int f() {
      return this.a(15);
   }

   public int g() {
      return this.b(15);
   }

   public int h() {
      return this.e >> 5;
   }

   public int i() {
      return this.f >> 5;
   }

   public int j() {
      return this.e & 31;
   }

   public int k() {
      return this.f & 31;
   }

   public ja a(int $$0, int $$1, int $$2) {
      return new ja(this.a($$0), $$1, this.b($$2));
   }

   public int a(int $$0) {
      return kc.a(this.e, $$0);
   }

   public int b(int $$0) {
      return kc.a(this.f, $$0);
   }

   public ja c(int $$0) {
      return new ja(this.b(), $$0, this.c());
   }

   @Override
   public String toString() {
      return "[" + this.e + ", " + this.f + "]";
   }

   public ja l() {
      return new ja(this.d(), 0, this.e());
   }

   public int a(dbm $$0) {
      return this.e($$0.e, $$0.f);
   }

   public int e(int $$0, int $$1) {
      return Math.max(Math.abs(this.e - $$0), Math.abs(this.f - $$1));
   }

   public int b(dbm $$0) {
      return this.f($$0.e, $$0.f);
   }

   public int c(long $$0) {
      return this.f(a($$0), b($$0));
   }

   private int f(int $$0, int $$1) {
      int $$2 = $$0 - this.e;
      int $$3 = $$1 - this.f;
      return $$2 * $$2 + $$3 * $$3;
   }

   public static Stream<dbm> a(dbm $$0, int $$1) {
      return a(new dbm($$0.e - $$1, $$0.f - $$1), new dbm($$0.e + $$1, $$0.f + $$1));
   }

   public static Stream<dbm> a(final dbm $$0, final dbm $$1) {
      int $$2 = Math.abs($$0.e - $$1.e) + 1;
      int $$3 = Math.abs($$0.f - $$1.f) + 1;
      final int $$4 = $$0.e < $$1.e ? 1 : -1;
      final int $$5 = $$0.f < $$1.f ? 1 : -1;
      return StreamSupport.stream(new AbstractSpliterator<dbm>((long)($$2 * $$3), 64) {
         @Nullable
         private dbm e;

         @Override
         public boolean tryAdvance(Consumer<? super dbm> $$0x) {
            if (this.e == null) {
               this.e = $$0;
            } else {
               int $$1 = this.e.e;
               int $$2 = this.e.f;
               if ($$1 == $$1.e) {
                  if ($$2 == $$1.f) {
                     return false;
                  }

                  this.e = new dbm($$0.e, $$2 + $$5);
               } else {
                  this.e = new dbm($$1 + $$4, $$2);
               }
            }

            $$0.accept(this.e);
            return true;
         }
      }, false);
   }
}
