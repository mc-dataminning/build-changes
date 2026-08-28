import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxs {
   Codec<dxs> b = dxt.b;
   Codec<jj<dxs>> c = akg.a(lr.aI, b);
   Codec<dxs> d = c.xmap(dxt.j::new, $$0 -> (jj)($$0 instanceof dxt.j $$1 ? $$1.j() : new jj.a<>($$0)));

   double a(dxs.b var1);

   void a(double[] var1, dxs.a var2);

   dxs a(dxs.f var1);

   double a();

   double b();

   axx<? extends dxs> c();

   default dxs a(double $$0, double $$1) {
      return new dxt.g(this, $$0, $$1);
   }

   default dxs d() {
      return dxt.a(this, dxt.k.a.a);
   }

   default dxs e() {
      return dxt.a(this, dxt.k.a.b);
   }

   default dxs f() {
      return dxt.a(this, dxt.k.a.c);
   }

   default dxs g() {
      return dxt.a(this, dxt.k.a.d);
   }

   default dxs h() {
      return dxt.a(this, dxt.k.a.e);
   }

   default dxs i() {
      return dxt.a(this, dxt.k.a.f);
   }

   public interface a {
      dxs.b a(int var1);

      void a(double[] var1, dxs var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dzb d() {
         return dzb.a();
      }
   }

   public static record c(jj<ene.a> b, @Nullable ene c) {
      public static final Codec<dxs.c> a = ene.a.b.xmap($$0 -> new dxs.c($$0, null), dxs.c::b);

      public c(jj<ene.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxs {
      @Override
      default void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxs a(dxs.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxs.b {
   }

   public interface f {
      dxs apply(dxs var1);

      default dxs.c a(dxs.c $$0) {
         return $$0;
      }
   }
}
