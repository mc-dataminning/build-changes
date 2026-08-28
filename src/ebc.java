import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ebc {
   Codec<ebc> b = ebd.b;
   Codec<jq<ebc>> c = alh.a(ma.aK, b);
   Codec<ebc> d = c.xmap(ebd.j::new, $$0 -> (jq)($$0 instanceof ebd.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(ebc.b var1);

   void a(double[] var1, ebc.a var2);

   ebc a(ebc.f var1);

   double a();

   double b();

   azg<? extends ebc> c();

   default ebc a(double $$0, double $$1) {
      return new ebd.g(this, $$0, $$1);
   }

   default ebc d() {
      return ebd.a(this, ebd.k.a.a);
   }

   default ebc e() {
      return ebd.a(this, ebd.k.a.b);
   }

   default ebc f() {
      return ebd.a(this, ebd.k.a.c);
   }

   default ebc g() {
      return ebd.a(this, ebd.k.a.d);
   }

   default ebc h() {
      return ebd.a(this, ebd.k.a.e);
   }

   default ebc i() {
      return ebd.a(this, ebd.k.a.f);
   }

   public interface a {
      ebc.b a(int var1);

      void a(double[] var1, ebc var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ecl d() {
         return ecl.a();
      }
   }

   public static record c(jq<eqr.a> b, @Nullable eqr c) {
      public static final Codec<ebc.c> a = eqr.a.b.xmap($$0 -> new ebc.c($$0, null), ebc.c::b);

      public c(jq<eqr.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ebc {
      @Override
      default void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ebc a(ebc.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ebc.b {
   }

   public interface f {
      ebc apply(ebc var1);

      default ebc.c a(ebc.c $$0) {
         return $$0;
      }
   }
}
