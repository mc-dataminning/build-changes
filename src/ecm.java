import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ecm {
   Codec<ecm> b = ecn.b;
   Codec<jr<ecm>> c = akr.a(mc.aM, b);
   Codec<ecm> d = c.xmap(ecn.j::new, $$0 -> (jr)($$0 instanceof ecn.j $$1 ? $$1.j() : new jr.a<>($$0)));

   double a(ecm.b var1);

   void a(double[] var1, ecm.a var2);

   ecm a(ecm.f var1);

   double a();

   double b();

   ays<? extends ecm> c();

   default ecm a(double $$0, double $$1) {
      return new ecn.g(this, $$0, $$1);
   }

   default ecm d() {
      return ecn.a(this, ecn.k.a.a);
   }

   default ecm e() {
      return ecn.a(this, ecn.k.a.b);
   }

   default ecm f() {
      return ecn.a(this, ecn.k.a.c);
   }

   default ecm g() {
      return ecn.a(this, ecn.k.a.d);
   }

   default ecm h() {
      return ecn.a(this, ecn.k.a.e);
   }

   default ecm i() {
      return ecn.a(this, ecn.k.a.f);
   }

   public interface a {
      ecm.b a(int var1);

      void a(double[] var1, ecm var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default edv d() {
         return edv.a();
      }
   }

   public static record c(jr<esd.a> b, @Nullable esd c) {
      public static final Codec<ecm.c> a = esd.a.b.xmap($$0 -> new ecm.c($$0, null), ecm.c::b);

      public c(jr<esd.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ecm {
      @Override
      default void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ecm a(ecm.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ecm.b {
   }

   public interface f {
      ecm apply(ecm var1);

      default ecm.c a(ecm.c $$0) {
         return $$0;
      }
   }
}
