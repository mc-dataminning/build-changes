import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxm {
   Codec<dxm> b = dxn.b;
   Codec<ji<dxm>> c = ala.a(lq.aD, b);
   Codec<dxm> d = c.xmap(dxn.j::new, $$0 -> (ji)($$0 instanceof dxn.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxm.b var1);

   void a(double[] var1, dxm.a var2);

   dxm a(dxm.f var1);

   double a();

   double b();

   ayr<? extends dxm> c();

   default dxm a(double $$0, double $$1) {
      return new dxn.g(this, $$0, $$1);
   }

   default dxm d() {
      return dxn.a(this, dxn.k.a.a);
   }

   default dxm e() {
      return dxn.a(this, dxn.k.a.b);
   }

   default dxm f() {
      return dxn.a(this, dxn.k.a.c);
   }

   default dxm g() {
      return dxn.a(this, dxn.k.a.d);
   }

   default dxm h() {
      return dxn.a(this, dxn.k.a.e);
   }

   default dxm i() {
      return dxn.a(this, dxn.k.a.f);
   }

   public interface a {
      dxm.b a(int var1);

      void a(double[] var1, dxm var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyv d() {
         return dyv.a();
      }
   }

   public static record c(ji<emx.a> b, @Nullable emx c) {
      public static final Codec<dxm.c> a = emx.a.b.xmap($$0 -> new dxm.c($$0, null), dxm.c::b);

      public c(ji<emx.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxm {
      @Override
      default void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxm a(dxm.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxm.b {
   }

   public interface f {
      dxm apply(dxm var1);

      default dxm.c a(dxm.c $$0) {
         return $$0;
      }
   }
}
