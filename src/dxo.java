import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxo {
   Codec<dxo> b = dxp.b;
   Codec<ji<dxo>> c = alb.a(lq.aD, b);
   Codec<dxo> d = c.xmap(dxp.j::new, $$0 -> (ji)($$0 instanceof dxp.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxo.b var1);

   void a(double[] var1, dxo.a var2);

   dxo a(dxo.f var1);

   double a();

   double b();

   ays<? extends dxo> c();

   default dxo a(double $$0, double $$1) {
      return new dxp.g(this, $$0, $$1);
   }

   default dxo d() {
      return dxp.a(this, dxp.k.a.a);
   }

   default dxo e() {
      return dxp.a(this, dxp.k.a.b);
   }

   default dxo f() {
      return dxp.a(this, dxp.k.a.c);
   }

   default dxo g() {
      return dxp.a(this, dxp.k.a.d);
   }

   default dxo h() {
      return dxp.a(this, dxp.k.a.e);
   }

   default dxo i() {
      return dxp.a(this, dxp.k.a.f);
   }

   public interface a {
      dxo.b a(int var1);

      void a(double[] var1, dxo var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyx d() {
         return dyx.a();
      }
   }

   public static record c(ji<emz.a> b, @Nullable emz c) {
      public static final Codec<dxo.c> a = emz.a.b.xmap($$0 -> new dxo.c($$0, null), dxo.c::b);

      public c(ji<emz.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxo {
      @Override
      default void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxo a(dxo.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxo.b {
   }

   public interface f {
      dxo apply(dxo var1);

      default dxo.c a(dxo.c $$0) {
         return $$0;
      }
   }
}
