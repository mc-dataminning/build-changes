import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dzp {
   Codec<dzp> b = dzq.b;
   Codec<jn<dzp>> c = akx.a(lv.aJ, b);
   Codec<dzp> d = c.xmap(dzq.j::new, $$0 -> (jn)($$0 instanceof dzq.j $$1 ? $$1.j() : new jn.a<>($$0)));

   double a(dzp.b var1);

   void a(double[] var1, dzp.a var2);

   dzp a(dzp.f var1);

   double a();

   double b();

   ayv<? extends dzp> c();

   default dzp a(double $$0, double $$1) {
      return new dzq.g(this, $$0, $$1);
   }

   default dzp d() {
      return dzq.a(this, dzq.k.a.a);
   }

   default dzp e() {
      return dzq.a(this, dzq.k.a.b);
   }

   default dzp f() {
      return dzq.a(this, dzq.k.a.c);
   }

   default dzp g() {
      return dzq.a(this, dzq.k.a.d);
   }

   default dzp h() {
      return dzq.a(this, dzq.k.a.e);
   }

   default dzp i() {
      return dzq.a(this, dzq.k.a.f);
   }

   public interface a {
      dzp.b a(int var1);

      void a(double[] var1, dzp var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eay d() {
         return eay.a();
      }
   }

   public static record c(jn<epe.a> b, @Nullable epe c) {
      public static final Codec<dzp.c> a = epe.a.b.xmap($$0 -> new dzp.c($$0, null), dzp.c::b);

      public c(jn<epe.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dzp {
      @Override
      default void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dzp a(dzp.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dzp.b {
   }

   public interface f {
      dzp apply(dzp var1);

      default dzp.c a(dzp.c $$0) {
         return $$0;
      }
   }
}
