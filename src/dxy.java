import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxy {
   Codec<dxy> b = dxz.b;
   Codec<jj<dxy>> c = akg.a(lr.aI, b);
   Codec<dxy> d = c.xmap(dxz.j::new, $$0 -> (jj)($$0 instanceof dxz.j $$1 ? $$1.j() : new jj.a<>($$0)));

   double a(dxy.b var1);

   void a(double[] var1, dxy.a var2);

   dxy a(dxy.f var1);

   double a();

   double b();

   axz<? extends dxy> c();

   default dxy a(double $$0, double $$1) {
      return new dxz.g(this, $$0, $$1);
   }

   default dxy d() {
      return dxz.a(this, dxz.k.a.a);
   }

   default dxy e() {
      return dxz.a(this, dxz.k.a.b);
   }

   default dxy f() {
      return dxz.a(this, dxz.k.a.c);
   }

   default dxy g() {
      return dxz.a(this, dxz.k.a.d);
   }

   default dxy h() {
      return dxz.a(this, dxz.k.a.e);
   }

   default dxy i() {
      return dxz.a(this, dxz.k.a.f);
   }

   public interface a {
      dxy.b a(int var1);

      void a(double[] var1, dxy var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dzh d() {
         return dzh.a();
      }
   }

   public static record c(jj<enk.a> b, @Nullable enk c) {
      public static final Codec<dxy.c> a = enk.a.b.xmap($$0 -> new dxy.c($$0, null), dxy.c::b);

      public c(jj<enk.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxy {
      @Override
      default void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxy a(dxy.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxy.b {
   }

   public interface f {
      dxy apply(dxy var1);

      default dxy.c a(dxy.c $$0) {
         return $$0;
      }
   }
}
