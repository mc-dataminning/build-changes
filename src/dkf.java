import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkf {
   Codec<dkf> b = dkg.b;
   Codec<he<dkf>> c = aev.a(jc.au, b);
   Codec<dkf> d = c.xmap(dkg.j::new, $$0 -> (he)($$0 instanceof dkg.j $$1 ? $$1.j() : new he.a<>($$0)));

   double a(dkf.b var1);

   void a(double[] var1, dkf.a var2);

   dkf a(dkf.f var1);

   double a();

   double b();

   arv<? extends dkf> c();

   default dkf a(double $$0, double $$1) {
      return new dkg.g(this, $$0, $$1);
   }

   default dkf d() {
      return dkg.a(this, dkg.k.a.a);
   }

   default dkf e() {
      return dkg.a(this, dkg.k.a.b);
   }

   default dkf f() {
      return dkg.a(this, dkg.k.a.c);
   }

   default dkf g() {
      return dkg.a(this, dkg.k.a.d);
   }

   default dkf h() {
      return dkg.a(this, dkg.k.a.e);
   }

   default dkf i() {
      return dkg.a(this, dkg.k.a.f);
   }

   public interface a {
      dkf.b a(int var1);

      void a(double[] var1, dkf var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlo d() {
         return dlo.a();
      }
   }

   public static record c(he<dzj.a> b, @Nullable dzj c) {
      public static final Codec<dkf.c> a = dzj.a.b.xmap($$0 -> new dkf.c($$0, null), dkf.c::b);

      public c(he<dzj.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkf {
      @Override
      default void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkf a(dkf.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkf.b {
   }

   public interface f {
      dkf apply(dkf var1);

      default dkf.c a(dkf.c $$0) {
         return $$0;
      }
   }
}
