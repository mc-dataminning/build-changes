import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkb {
   Codec<dkb> b = dkc.b;
   Codec<he<dkb>> c = aen.a(jc.at, b);
   Codec<dkb> d = c.xmap(dkc.j::new, $$0 -> (he)($$0 instanceof dkc.j $$1 ? $$1.j() : new he.a<>($$0)));

   double a(dkb.b var1);

   void a(double[] var1, dkb.a var2);

   dkb a(dkb.f var1);

   double a();

   double b();

   arj<? extends dkb> c();

   default dkb a(double $$0, double $$1) {
      return new dkc.g(this, $$0, $$1);
   }

   default dkb d() {
      return dkc.a(this, dkc.k.a.a);
   }

   default dkb e() {
      return dkc.a(this, dkc.k.a.b);
   }

   default dkb f() {
      return dkc.a(this, dkc.k.a.c);
   }

   default dkb g() {
      return dkc.a(this, dkc.k.a.d);
   }

   default dkb h() {
      return dkc.a(this, dkc.k.a.e);
   }

   default dkb i() {
      return dkc.a(this, dkc.k.a.f);
   }

   public interface a {
      dkb.b a(int var1);

      void a(double[] var1, dkb var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlk d() {
         return dlk.a();
      }
   }

   public static record c(he<dzf.a> b, @Nullable dzf c) {
      public static final Codec<dkb.c> a = dzf.a.b.xmap($$0 -> new dkb.c($$0, null), dkb.c::b);

      public c(he<dzf.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkb {
      @Override
      default void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkb a(dkb.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkb.b {
   }

   public interface f {
      dkb apply(dkb var1);

      default dkb.c a(dkb.c $$0) {
         return $$0;
      }
   }
}
