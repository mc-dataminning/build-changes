import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxz {
   Codec<dxz> b = dya.b;
   Codec<jj<dxz>> c = akg.a(lr.aI, b);
   Codec<dxz> d = c.xmap(dya.j::new, $$0 -> (jj)($$0 instanceof dya.j $$1 ? $$1.j() : new jj.a<>($$0)));

   double a(dxz.b var1);

   void a(double[] var1, dxz.a var2);

   dxz a(dxz.f var1);

   double a();

   double b();

   axz<? extends dxz> c();

   default dxz a(double $$0, double $$1) {
      return new dya.g(this, $$0, $$1);
   }

   default dxz d() {
      return dya.a(this, dya.k.a.a);
   }

   default dxz e() {
      return dya.a(this, dya.k.a.b);
   }

   default dxz f() {
      return dya.a(this, dya.k.a.c);
   }

   default dxz g() {
      return dya.a(this, dya.k.a.d);
   }

   default dxz h() {
      return dya.a(this, dya.k.a.e);
   }

   default dxz i() {
      return dya.a(this, dya.k.a.f);
   }

   public interface a {
      dxz.b a(int var1);

      void a(double[] var1, dxz var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dzi d() {
         return dzi.a();
      }
   }

   public static record c(jj<enm.a> b, @Nullable enm c) {
      public static final Codec<dxz.c> a = enm.a.b.xmap($$0 -> new dxz.c($$0, null), dxz.c::b);

      public c(jj<enm.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxz {
      @Override
      default void a(double[] $$0, dxz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxz a(dxz.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxz.b {
   }

   public interface f {
      dxz apply(dxz var1);

      default dxz.c a(dxz.c $$0) {
         return $$0;
      }
   }
}
