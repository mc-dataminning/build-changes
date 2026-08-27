import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dwo {
   Codec<dwo> b = dwp.b;
   Codec<ix<dwo>> c = akj.a(lf.aD, b);
   Codec<dwo> d = c.xmap(dwp.j::new, $$0 -> (ix)($$0 instanceof dwp.j $$1 ? $$1.j() : new ix.a<>($$0)));

   double a(dwo.b var1);

   void a(double[] var1, dwo.a var2);

   dwo a(dwo.f var1);

   double a();

   double b();

   axy<? extends dwo> c();

   default dwo a(double $$0, double $$1) {
      return new dwp.g(this, $$0, $$1);
   }

   default dwo d() {
      return dwp.a(this, dwp.k.a.a);
   }

   default dwo e() {
      return dwp.a(this, dwp.k.a.b);
   }

   default dwo f() {
      return dwp.a(this, dwp.k.a.c);
   }

   default dwo g() {
      return dwp.a(this, dwp.k.a.d);
   }

   default dwo h() {
      return dwp.a(this, dwp.k.a.e);
   }

   default dwo i() {
      return dwp.a(this, dwp.k.a.f);
   }

   public interface a {
      dwo.b a(int var1);

      void a(double[] var1, dwo var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dxx d() {
         return dxx.a();
      }
   }

   public static record c(ix<elz.a> b, @Nullable elz c) {
      public static final Codec<dwo.c> a = elz.a.b.xmap($$0 -> new dwo.c($$0, null), dwo.c::b);

      public c(ix<elz.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dwo {
      @Override
      default void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dwo a(dwo.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dwo.b {
   }

   public interface f {
      dwo apply(dwo var1);

      default dwo.c a(dwo.c $$0) {
         return $$0;
      }
   }
}
