import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eck {
   Codec<eck> b = ecl.b;
   Codec<jr<eck>> c = akr.a(mc.aM, b);
   Codec<eck> d = c.xmap(ecl.j::new, $$0 -> (jr)($$0 instanceof ecl.j $$1 ? $$1.j() : new jr.a<>($$0)));

   double a(eck.b var1);

   void a(double[] var1, eck.a var2);

   eck a(eck.f var1);

   double a();

   double b();

   ays<? extends eck> c();

   default eck a(double $$0, double $$1) {
      return new ecl.g(this, $$0, $$1);
   }

   default eck d() {
      return ecl.a(this, ecl.k.a.a);
   }

   default eck e() {
      return ecl.a(this, ecl.k.a.b);
   }

   default eck f() {
      return ecl.a(this, ecl.k.a.c);
   }

   default eck g() {
      return ecl.a(this, ecl.k.a.d);
   }

   default eck h() {
      return ecl.a(this, ecl.k.a.e);
   }

   default eck i() {
      return ecl.a(this, ecl.k.a.f);
   }

   public interface a {
      eck.b a(int var1);

      void a(double[] var1, eck var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default edt d() {
         return edt.a();
      }
   }

   public static record c(jr<esb.a> b, @Nullable esb c) {
      public static final Codec<eck.c> a = esb.a.b.xmap($$0 -> new eck.c($$0, null), eck.c::b);

      public c(jr<esb.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends eck {
      @Override
      default void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default eck a(eck.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements eck.b {
   }

   public interface f {
      eck apply(eck var1);

      default eck.c a(eck.c $$0) {
         return $$0;
      }
   }
}
