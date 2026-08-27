import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface drj {
   Codec<drj> b = drk.b;
   Codec<il<drj>> c = aiy.a(ki.ay, b);
   Codec<drj> d = c.xmap(drk.j::new, $$0 -> (il)($$0 instanceof drk.j $$1 ? $$1.j() : new il.a<>($$0)));

   double a(drj.b var1);

   void a(double[] var1, drj.a var2);

   drj a(drj.f var1);

   double a();

   double b();

   awg<? extends drj> c();

   default drj a(double $$0, double $$1) {
      return new drk.g(this, $$0, $$1);
   }

   default drj d() {
      return drk.a(this, drk.k.a.a);
   }

   default drj e() {
      return drk.a(this, drk.k.a.b);
   }

   default drj f() {
      return drk.a(this, drk.k.a.c);
   }

   default drj g() {
      return drk.a(this, drk.k.a.d);
   }

   default drj h() {
      return drk.a(this, drk.k.a.e);
   }

   default drj i() {
      return drk.a(this, drk.k.a.f);
   }

   public interface a {
      drj.b a(int var1);

      void a(double[] var1, drj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dss d() {
         return dss.a();
      }
   }

   public static record c(il<egu.a> b, @Nullable egu c) {
      public static final Codec<drj.c> a = egu.a.b.xmap($$0 -> new drj.c($$0, null), drj.c::b);

      public c(il<egu.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends drj {
      @Override
      default void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default drj a(drj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements drj.b {
   }

   public interface f {
      drj apply(drj var1);

      default drj.c a(drj.c $$0) {
         return $$0;
      }
   }
}
