import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxn {
   Codec<dxn> b = dxo.b;
   Codec<ji<dxn>> c = alb.a(lq.aD, b);
   Codec<dxn> d = c.xmap(dxo.j::new, $$0 -> (ji)($$0 instanceof dxo.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxn.b var1);

   void a(double[] var1, dxn.a var2);

   dxn a(dxn.f var1);

   double a();

   double b();

   ays<? extends dxn> c();

   default dxn a(double $$0, double $$1) {
      return new dxo.g(this, $$0, $$1);
   }

   default dxn d() {
      return dxo.a(this, dxo.k.a.a);
   }

   default dxn e() {
      return dxo.a(this, dxo.k.a.b);
   }

   default dxn f() {
      return dxo.a(this, dxo.k.a.c);
   }

   default dxn g() {
      return dxo.a(this, dxo.k.a.d);
   }

   default dxn h() {
      return dxo.a(this, dxo.k.a.e);
   }

   default dxn i() {
      return dxo.a(this, dxo.k.a.f);
   }

   public interface a {
      dxn.b a(int var1);

      void a(double[] var1, dxn var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyw d() {
         return dyw.a();
      }
   }

   public static record c(ji<emy.a> b, @Nullable emy c) {
      public static final Codec<dxn.c> a = emy.a.b.xmap($$0 -> new dxn.c($$0, null), dxn.c::b);

      public c(ji<emy.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxn {
      @Override
      default void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxn a(dxn.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxn.b {
   }

   public interface f {
      dxn apply(dxn var1);

      default dxn.c a(dxn.c $$0) {
         return $$0;
      }
   }
}
