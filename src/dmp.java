import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dmp {
   Codec<dmp> b = dmq.b;
   Codec<ig<dmp>> c = agi.a(kd.av, b);
   Codec<dmp> d = c.xmap(dmq.j::new, $$0 -> (ig)($$0 instanceof dmq.j $$1 ? $$1.j() : new ig.a<>($$0)));

   double a(dmp.b var1);

   void a(double[] var1, dmp.a var2);

   dmp a(dmp.f var1);

   double a();

   double b();

   atk<? extends dmp> c();

   default dmp a(double $$0, double $$1) {
      return new dmq.g(this, $$0, $$1);
   }

   default dmp d() {
      return dmq.a(this, dmq.k.a.a);
   }

   default dmp e() {
      return dmq.a(this, dmq.k.a.b);
   }

   default dmp f() {
      return dmq.a(this, dmq.k.a.c);
   }

   default dmp g() {
      return dmq.a(this, dmq.k.a.d);
   }

   default dmp h() {
      return dmq.a(this, dmq.k.a.e);
   }

   default dmp i() {
      return dmq.a(this, dmq.k.a.f);
   }

   public interface a {
      dmp.b a(int var1);

      void a(double[] var1, dmp var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dny d() {
         return dny.a();
      }
   }

   public static record c(ig<eca.a> b, @Nullable eca c) {
      public static final Codec<dmp.c> a = eca.a.b.xmap($$0 -> new dmp.c($$0, null), dmp.c::b);

      public c(ig<eca.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dmp {
      @Override
      default void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dmp a(dmp.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dmp.b {
   }

   public interface f {
      dmp apply(dmp var1);

      default dmp.c a(dmp.c $$0) {
         return $$0;
      }
   }
}
