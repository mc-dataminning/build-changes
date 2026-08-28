import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ead {
   Codec<ead> b = eae.b;
   Codec<jn<ead>> c = aky.a(lv.aK, b);
   Codec<ead> d = c.xmap(eae.j::new, $$0 -> (jn)($$0 instanceof eae.j $$1 ? $$1.j() : new jn.a<>($$0)));

   double a(ead.b var1);

   void a(double[] var1, ead.a var2);

   ead a(ead.f var1);

   double a();

   double b();

   ayw<? extends ead> c();

   default ead a(double $$0, double $$1) {
      return new eae.g(this, $$0, $$1);
   }

   default ead d() {
      return eae.a(this, eae.k.a.a);
   }

   default ead e() {
      return eae.a(this, eae.k.a.b);
   }

   default ead f() {
      return eae.a(this, eae.k.a.c);
   }

   default ead g() {
      return eae.a(this, eae.k.a.d);
   }

   default ead h() {
      return eae.a(this, eae.k.a.e);
   }

   default ead i() {
      return eae.a(this, eae.k.a.f);
   }

   public interface a {
      ead.b a(int var1);

      void a(double[] var1, ead var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ebm d() {
         return ebm.a();
      }
   }

   public static record c(jn<eps.a> b, @Nullable eps c) {
      public static final Codec<ead.c> a = eps.a.b.xmap($$0 -> new ead.c($$0, null), ead.c::b);

      public c(jn<eps.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ead {
      @Override
      default void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ead a(ead.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ead.b {
   }

   public interface f {
      ead apply(ead var1);

      default ead.c a(ead.c $$0) {
         return $$0;
      }
   }
}
