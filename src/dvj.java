import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dvj {
   Codec<dvj> b = dvk.b;
   Codec<iv<dvj>> c = akb.a(ld.aC, b);
   Codec<dvj> d = c.xmap(dvk.j::new, $$0 -> (iv)($$0 instanceof dvk.j $$1 ? $$1.j() : new iv.a<>($$0)));

   double a(dvj.b var1);

   void a(double[] var1, dvj.a var2);

   dvj a(dvj.f var1);

   double a();

   double b();

   axq<? extends dvj> c();

   default dvj a(double $$0, double $$1) {
      return new dvk.g(this, $$0, $$1);
   }

   default dvj d() {
      return dvk.a(this, dvk.k.a.a);
   }

   default dvj e() {
      return dvk.a(this, dvk.k.a.b);
   }

   default dvj f() {
      return dvk.a(this, dvk.k.a.c);
   }

   default dvj g() {
      return dvk.a(this, dvk.k.a.d);
   }

   default dvj h() {
      return dvk.a(this, dvk.k.a.e);
   }

   default dvj i() {
      return dvk.a(this, dvk.k.a.f);
   }

   public interface a {
      dvj.b a(int var1);

      void a(double[] var1, dvj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dws d() {
         return dws.a();
      }
   }

   public static record c(iv<eku.a> b, @Nullable eku c) {
      public static final Codec<dvj.c> a = eku.a.b.xmap($$0 -> new dvj.c($$0, null), dvj.c::b);

      public c(iv<eku.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dvj {
      @Override
      default void a(double[] $$0, dvj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dvj a(dvj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dvj.b {
   }

   public interface f {
      dvj apply(dvj var1);

      default dvj.c a(dvj.c $$0) {
         return $$0;
      }
   }
}
