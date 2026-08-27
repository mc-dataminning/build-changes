import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkn {
   Codec<dkn> b = dko.b;
   Codec<hg<dkn>> c = aeu.a(je.at, b);
   Codec<dkn> d = c.xmap(dko.j::new, $$0 -> (hg)($$0 instanceof dko.j $$1 ? $$1.j() : new hg.a<>($$0)));

   double a(dkn.b var1);

   void a(double[] var1, dkn.a var2);

   dkn a(dkn.f var1);

   double a();

   double b();

   ars<? extends dkn> c();

   default dkn a(double $$0, double $$1) {
      return new dko.g(this, $$0, $$1);
   }

   default dkn d() {
      return dko.a(this, dko.k.a.a);
   }

   default dkn e() {
      return dko.a(this, dko.k.a.b);
   }

   default dkn f() {
      return dko.a(this, dko.k.a.c);
   }

   default dkn g() {
      return dko.a(this, dko.k.a.d);
   }

   default dkn h() {
      return dko.a(this, dko.k.a.e);
   }

   default dkn i() {
      return dko.a(this, dko.k.a.f);
   }

   public interface a {
      dkn.b a(int var1);

      void a(double[] var1, dkn var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlw d() {
         return dlw.a();
      }
   }

   public static record c(hg<dzr.a> b, @Nullable dzr c) {
      public static final Codec<dkn.c> a = dzr.a.b.xmap($$0 -> new dkn.c($$0, null), dkn.c::b);

      public c(hg<dzr.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkn {
      @Override
      default void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkn a(dkn.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkn.b {
   }

   public interface f {
      dkn apply(dkn var1);

      default dkn.c a(dkn.c $$0) {
         return $$0;
      }
   }
}
