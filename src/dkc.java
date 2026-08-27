import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkc {
   Codec<dkc> b = dkd.b;
   Codec<he<dkc>> c = aen.a(jc.at, b);
   Codec<dkc> d = c.xmap(dkd.j::new, $$0 -> (he)($$0 instanceof dkd.j $$1 ? $$1.j() : new he.a<>($$0)));

   double a(dkc.b var1);

   void a(double[] var1, dkc.a var2);

   dkc a(dkc.f var1);

   double a();

   double b();

   arj<? extends dkc> c();

   default dkc a(double $$0, double $$1) {
      return new dkd.g(this, $$0, $$1);
   }

   default dkc d() {
      return dkd.a(this, dkd.k.a.a);
   }

   default dkc e() {
      return dkd.a(this, dkd.k.a.b);
   }

   default dkc f() {
      return dkd.a(this, dkd.k.a.c);
   }

   default dkc g() {
      return dkd.a(this, dkd.k.a.d);
   }

   default dkc h() {
      return dkd.a(this, dkd.k.a.e);
   }

   default dkc i() {
      return dkd.a(this, dkd.k.a.f);
   }

   public interface a {
      dkc.b a(int var1);

      void a(double[] var1, dkc var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dll d() {
         return dll.a();
      }
   }

   public static record c(he<dzg.a> b, @Nullable dzg c) {
      public static final Codec<dkc.c> a = dzg.a.b.xmap($$0 -> new dkc.c($$0, null), dkc.c::b);

      public c(he<dzg.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkc {
      @Override
      default void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkc a(dkc.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkc.b {
   }

   public interface f {
      dkc apply(dkc var1);

      default dkc.c a(dkc.c $$0) {
         return $$0;
      }
   }
}
