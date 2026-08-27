import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dqh {
   Codec<dqh> b = dqi.b;
   Codec<ij<dqh>> c = aiu.a(kg.ax, b);
   Codec<dqh> d = c.xmap(dqi.j::new, $$0 -> (ij)($$0 instanceof dqi.j $$1 ? $$1.j() : new ij.a<>($$0)));

   double a(dqh.b var1);

   void a(double[] var1, dqh.a var2);

   dqh a(dqh.f var1);

   double a();

   double b();

   awb<? extends dqh> c();

   default dqh a(double $$0, double $$1) {
      return new dqi.g(this, $$0, $$1);
   }

   default dqh d() {
      return dqi.a(this, dqi.k.a.a);
   }

   default dqh e() {
      return dqi.a(this, dqi.k.a.b);
   }

   default dqh f() {
      return dqi.a(this, dqi.k.a.c);
   }

   default dqh g() {
      return dqi.a(this, dqi.k.a.d);
   }

   default dqh h() {
      return dqi.a(this, dqi.k.a.e);
   }

   default dqh i() {
      return dqi.a(this, dqi.k.a.f);
   }

   public interface a {
      dqh.b a(int var1);

      void a(double[] var1, dqh var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default drq d() {
         return drq.a();
      }
   }

   public static record c(ij<efs.a> b, @Nullable efs c) {
      public static final Codec<dqh.c> a = efs.a.b.xmap($$0 -> new dqh.c($$0, null), dqh.c::b);

      public c(ij<efs.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dqh {
      @Override
      default void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dqh a(dqh.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dqh.b {
   }

   public interface f {
      dqh apply(dqh var1);

      default dqh.c a(dqh.c $$0) {
         return $$0;
      }
   }
}
