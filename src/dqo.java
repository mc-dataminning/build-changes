import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dqo {
   Codec<dqo> b = dqp.b;
   Codec<ij<dqo>> c = aiu.a(kg.ax, b);
   Codec<dqo> d = c.xmap(dqp.j::new, $$0 -> (ij)($$0 instanceof dqp.j $$1 ? $$1.j() : new ij.a<>($$0)));

   double a(dqo.b var1);

   void a(double[] var1, dqo.a var2);

   dqo a(dqo.f var1);

   double a();

   double b();

   awc<? extends dqo> c();

   default dqo a(double $$0, double $$1) {
      return new dqp.g(this, $$0, $$1);
   }

   default dqo d() {
      return dqp.a(this, dqp.k.a.a);
   }

   default dqo e() {
      return dqp.a(this, dqp.k.a.b);
   }

   default dqo f() {
      return dqp.a(this, dqp.k.a.c);
   }

   default dqo g() {
      return dqp.a(this, dqp.k.a.d);
   }

   default dqo h() {
      return dqp.a(this, dqp.k.a.e);
   }

   default dqo i() {
      return dqp.a(this, dqp.k.a.f);
   }

   public interface a {
      dqo.b a(int var1);

      void a(double[] var1, dqo var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default drx d() {
         return drx.a();
      }
   }

   public static record c(ij<efz.a> b, @Nullable efz c) {
      public static final Codec<dqo.c> a = efz.a.b.xmap($$0 -> new dqo.c($$0, null), dqo.c::b);

      public c(ij<efz.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dqo {
      @Override
      default void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dqo a(dqo.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dqo.b {
   }

   public interface f {
      dqo apply(dqo var1);

      default dqo.c a(dqo.c $$0) {
         return $$0;
      }
   }
}
