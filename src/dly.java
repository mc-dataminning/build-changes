import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dly {
   Codec<dly> b = dlz.b;
   Codec<ib<dly>> c = agc.a(jz.av, b);
   Codec<dly> d = c.xmap(dlz.j::new, $$0 -> (ib)($$0 instanceof dlz.j $$1 ? $$1.j() : new ib.a<>($$0)));

   double a(dly.b var1);

   void a(double[] var1, dly.a var2);

   dly a(dly.f var1);

   double a();

   double b();

   atc<? extends dly> c();

   default dly a(double $$0, double $$1) {
      return new dlz.g(this, $$0, $$1);
   }

   default dly d() {
      return dlz.a(this, dlz.k.a.a);
   }

   default dly e() {
      return dlz.a(this, dlz.k.a.b);
   }

   default dly f() {
      return dlz.a(this, dlz.k.a.c);
   }

   default dly g() {
      return dlz.a(this, dlz.k.a.d);
   }

   default dly h() {
      return dlz.a(this, dlz.k.a.e);
   }

   default dly i() {
      return dlz.a(this, dlz.k.a.f);
   }

   public interface a {
      dly.b a(int var1);

      void a(double[] var1, dly var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dnh d() {
         return dnh.a();
      }
   }

   public static record c(ib<ebj.a> b, @Nullable ebj c) {
      public static final Codec<dly.c> a = ebj.a.b.xmap($$0 -> new dly.c($$0, null), dly.c::b);

      public c(ib<ebj.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dly {
      @Override
      default void a(double[] $$0, dly.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dly a(dly.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dly.b {
   }

   public interface f {
      dly apply(dly var1);

      default dly.c a(dly.c $$0) {
         return $$0;
      }
   }
}
