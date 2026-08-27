import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface doi {
   Codec<doi> b = doj.b;
   Codec<ih<doi>> c = ahc.a(ke.ax, b);
   Codec<doi> d = c.xmap(doj.j::new, $$0 -> (ih)($$0 instanceof doj.j $$1 ? $$1.j() : new ih.a<>($$0)));

   double a(doi.b var1);

   void a(double[] var1, doi.a var2);

   doi a(doi.f var1);

   double a();

   double b();

   auh<? extends doi> c();

   default doi a(double $$0, double $$1) {
      return new doj.g(this, $$0, $$1);
   }

   default doi d() {
      return doj.a(this, doj.k.a.a);
   }

   default doi e() {
      return doj.a(this, doj.k.a.b);
   }

   default doi f() {
      return doj.a(this, doj.k.a.c);
   }

   default doi g() {
      return doj.a(this, doj.k.a.d);
   }

   default doi h() {
      return doj.a(this, doj.k.a.e);
   }

   default doi i() {
      return doj.a(this, doj.k.a.f);
   }

   public interface a {
      doi.b a(int var1);

      void a(double[] var1, doi var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dpr d() {
         return dpr.a();
      }
   }

   public static record c(ih<edt.a> b, @Nullable edt c) {
      public static final Codec<doi.c> a = edt.a.b.xmap($$0 -> new doi.c($$0, null), doi.c::b);

      public c(ih<edt.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends doi {
      @Override
      default void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default doi a(doi.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements doi.b {
   }

   public interface f {
      doi apply(doi var1);

      default doi.c a(doi.c $$0) {
         return $$0;
      }
   }
}
