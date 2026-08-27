import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface doj {
   Codec<doj> b = dok.b;
   Codec<ih<doj>> c = ahc.a(ke.ax, b);
   Codec<doj> d = c.xmap(dok.j::new, $$0 -> (ih)($$0 instanceof dok.j $$1 ? $$1.j() : new ih.a<>($$0)));

   double a(doj.b var1);

   void a(double[] var1, doj.a var2);

   doj a(doj.f var1);

   double a();

   double b();

   aui<? extends doj> c();

   default doj a(double $$0, double $$1) {
      return new dok.g(this, $$0, $$1);
   }

   default doj d() {
      return dok.a(this, dok.k.a.a);
   }

   default doj e() {
      return dok.a(this, dok.k.a.b);
   }

   default doj f() {
      return dok.a(this, dok.k.a.c);
   }

   default doj g() {
      return dok.a(this, dok.k.a.d);
   }

   default doj h() {
      return dok.a(this, dok.k.a.e);
   }

   default doj i() {
      return dok.a(this, dok.k.a.f);
   }

   public interface a {
      doj.b a(int var1);

      void a(double[] var1, doj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dps d() {
         return dps.a();
      }
   }

   public static record c(ih<edu.a> b, @Nullable edu c) {
      public static final Codec<doj.c> a = edu.a.b.xmap($$0 -> new doj.c($$0, null), doj.c::b);

      public c(ih<edu.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends doj {
      @Override
      default void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default doj a(doj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements doj.b {
   }

   public interface f {
      doj apply(doj var1);

      default doj.c a(doj.c $$0) {
         return $$0;
      }
   }
}
