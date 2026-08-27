import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dvs {
   Codec<dvs> b = dvt.b;
   Codec<iw<dvs>> c = akd.a(le.aD, b);
   Codec<dvs> d = c.xmap(dvt.j::new, $$0 -> (iw)($$0 instanceof dvt.j $$1 ? $$1.j() : new iw.a<>($$0)));

   double a(dvs.b var1);

   void a(double[] var1, dvs.a var2);

   dvs a(dvs.f var1);

   double a();

   double b();

   axt<? extends dvs> c();

   default dvs a(double $$0, double $$1) {
      return new dvt.g(this, $$0, $$1);
   }

   default dvs d() {
      return dvt.a(this, dvt.k.a.a);
   }

   default dvs e() {
      return dvt.a(this, dvt.k.a.b);
   }

   default dvs f() {
      return dvt.a(this, dvt.k.a.c);
   }

   default dvs g() {
      return dvt.a(this, dvt.k.a.d);
   }

   default dvs h() {
      return dvt.a(this, dvt.k.a.e);
   }

   default dvs i() {
      return dvt.a(this, dvt.k.a.f);
   }

   public interface a {
      dvs.b a(int var1);

      void a(double[] var1, dvs var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dxb d() {
         return dxb.a();
      }
   }

   public static record c(iw<eld.a> b, @Nullable eld c) {
      public static final Codec<dvs.c> a = eld.a.b.xmap($$0 -> new dvs.c($$0, null), dvs.c::b);

      public c(iw<eld.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dvs {
      @Override
      default void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dvs a(dvs.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dvs.b {
   }

   public interface f {
      dvs apply(dvs var1);

      default dvs.c a(dvs.c $$0) {
         return $$0;
      }
   }
}
