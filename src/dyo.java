import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dyo {
   Codec<dyo> b = dyp.b;
   Codec<jm<dyo>> c = akm.a(lu.aJ, b);
   Codec<dyo> d = c.xmap(dyp.j::new, $$0 -> (jm)($$0 instanceof dyp.j $$1 ? $$1.j() : new jm.a<>($$0)));

   double a(dyo.b var1);

   void a(double[] var1, dyo.a var2);

   dyo a(dyo.f var1);

   double a();

   double b();

   ayg<? extends dyo> c();

   default dyo a(double $$0, double $$1) {
      return new dyp.g(this, $$0, $$1);
   }

   default dyo d() {
      return dyp.a(this, dyp.k.a.a);
   }

   default dyo e() {
      return dyp.a(this, dyp.k.a.b);
   }

   default dyo f() {
      return dyp.a(this, dyp.k.a.c);
   }

   default dyo g() {
      return dyp.a(this, dyp.k.a.d);
   }

   default dyo h() {
      return dyp.a(this, dyp.k.a.e);
   }

   default dyo i() {
      return dyp.a(this, dyp.k.a.f);
   }

   public interface a {
      dyo.b a(int var1);

      void a(double[] var1, dyo var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dzx d() {
         return dzx.a();
      }
   }

   public static record c(jm<eob.a> b, @Nullable eob c) {
      public static final Codec<dyo.c> a = eob.a.b.xmap($$0 -> new dyo.c($$0, null), dyo.c::b);

      public c(jm<eob.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dyo {
      @Override
      default void a(double[] $$0, dyo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dyo a(dyo.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dyo.b {
   }

   public interface f {
      dyo apply(dyo var1);

      default dyo.c a(dyo.c $$0) {
         return $$0;
      }
   }
}
