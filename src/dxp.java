import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxp {
   Codec<dxp> b = dxq.b;
   Codec<ji<dxp>> c = alb.a(lq.aD, b);
   Codec<dxp> d = c.xmap(dxq.j::new, $$0 -> (ji)($$0 instanceof dxq.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxp.b var1);

   void a(double[] var1, dxp.a var2);

   dxp a(dxp.f var1);

   double a();

   double b();

   ays<? extends dxp> c();

   default dxp a(double $$0, double $$1) {
      return new dxq.g(this, $$0, $$1);
   }

   default dxp d() {
      return dxq.a(this, dxq.k.a.a);
   }

   default dxp e() {
      return dxq.a(this, dxq.k.a.b);
   }

   default dxp f() {
      return dxq.a(this, dxq.k.a.c);
   }

   default dxp g() {
      return dxq.a(this, dxq.k.a.d);
   }

   default dxp h() {
      return dxq.a(this, dxq.k.a.e);
   }

   default dxp i() {
      return dxq.a(this, dxq.k.a.f);
   }

   public interface a {
      dxp.b a(int var1);

      void a(double[] var1, dxp var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyy d() {
         return dyy.a();
      }
   }

   public static record c(ji<ena.a> b, @Nullable ena c) {
      public static final Codec<dxp.c> a = ena.a.b.xmap($$0 -> new dxp.c($$0, null), dxp.c::b);

      public c(ji<ena.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxp {
      @Override
      default void a(double[] $$0, dxp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxp a(dxp.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxp.b {
   }

   public interface f {
      dxp apply(dxp var1);

      default dxp.c a(dxp.c $$0) {
         return $$0;
      }
   }
}
