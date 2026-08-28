import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eay {
   Codec<eay> b = eaz.b;
   Codec<jq<eay>> c = ale.a(lz.aK, b);
   Codec<eay> d = c.xmap(eaz.j::new, $$0 -> (jq)($$0 instanceof eaz.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(eay.b var1);

   void a(double[] var1, eay.a var2);

   eay a(eay.f var1);

   double a();

   double b();

   azd<? extends eay> c();

   default eay a(double $$0, double $$1) {
      return new eaz.g(this, $$0, $$1);
   }

   default eay d() {
      return eaz.a(this, eaz.k.a.a);
   }

   default eay e() {
      return eaz.a(this, eaz.k.a.b);
   }

   default eay f() {
      return eaz.a(this, eaz.k.a.c);
   }

   default eay g() {
      return eaz.a(this, eaz.k.a.d);
   }

   default eay h() {
      return eaz.a(this, eaz.k.a.e);
   }

   default eay i() {
      return eaz.a(this, eaz.k.a.f);
   }

   public interface a {
      eay.b a(int var1);

      void a(double[] var1, eay var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ech d() {
         return ech.a();
      }
   }

   public static record c(jq<eqn.a> b, @Nullable eqn c) {
      public static final Codec<eay.c> a = eqn.a.b.xmap($$0 -> new eay.c($$0, null), eay.c::b);

      public c(jq<eqn.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends eay {
      @Override
      default void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default eay a(eay.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements eay.b {
   }

   public interface f {
      eay apply(eay var1);

      default eay.c a(eay.c $$0) {
         return $$0;
      }
   }
}
