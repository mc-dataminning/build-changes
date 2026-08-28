import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface efr {
   Codec<efr> b = efs.b;
   Codec<je<efr>> c = alc.a(mg.aN, b);
   Codec<efr> d = c.xmap(efs.j::new, $$0 -> (je)($$0 instanceof efs.j $$1 ? $$1.j() : new je.a<>($$0)));

   double a(efr.b var1);

   void a(double[] var1, efr.a var2);

   efr a(efr.f var1);

   double a();

   double b();

   azf<? extends efr> c();

   default efr a(double $$0, double $$1) {
      return new efs.g(this, $$0, $$1);
   }

   default efr d() {
      return efs.a(this, efs.k.a.a);
   }

   default efr e() {
      return efs.a(this, efs.k.a.b);
   }

   default efr f() {
      return efs.a(this, efs.k.a.c);
   }

   default efr g() {
      return efs.a(this, efs.k.a.d);
   }

   default efr h() {
      return efs.a(this, efs.k.a.e);
   }

   default efr i() {
      return efs.a(this, efs.k.a.f);
   }

   public interface a {
      efr.b a(int var1);

      void a(double[] var1, efr var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eha d() {
         return eha.a();
      }
   }

   public static record c(je<evj.a> b, @Nullable evj c) {
      public static final Codec<efr.c> a = evj.a.b.xmap($$0 -> new efr.c($$0, null), efr.c::b);

      public c(je<evj.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends efr {
      @Override
      default void a(double[] $$0, efr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default efr a(efr.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements efr.b {
   }

   public interface f {
      efr apply(efr var1);

      default efr.c a(efr.c $$0) {
         return $$0;
      }
   }
}
