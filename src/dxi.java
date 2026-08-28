import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxi {
   Codec<dxi> b = dxj.b;
   Codec<ji<dxi>> c = akx.a(lq.aD, b);
   Codec<dxi> d = c.xmap(dxj.j::new, $$0 -> (ji)($$0 instanceof dxj.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxi.b var1);

   void a(double[] var1, dxi.a var2);

   dxi a(dxi.f var1);

   double a();

   double b();

   ayn<? extends dxi> c();

   default dxi a(double $$0, double $$1) {
      return new dxj.g(this, $$0, $$1);
   }

   default dxi d() {
      return dxj.a(this, dxj.k.a.a);
   }

   default dxi e() {
      return dxj.a(this, dxj.k.a.b);
   }

   default dxi f() {
      return dxj.a(this, dxj.k.a.c);
   }

   default dxi g() {
      return dxj.a(this, dxj.k.a.d);
   }

   default dxi h() {
      return dxj.a(this, dxj.k.a.e);
   }

   default dxi i() {
      return dxj.a(this, dxj.k.a.f);
   }

   public interface a {
      dxi.b a(int var1);

      void a(double[] var1, dxi var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyr d() {
         return dyr.a();
      }
   }

   public static record c(ji<emt.a> b, @Nullable emt c) {
      public static final Codec<dxi.c> a = emt.a.b.xmap($$0 -> new dxi.c($$0, null), dxi.c::b);

      public c(ji<emt.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxi {
      @Override
      default void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxi a(dxi.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxi.b {
   }

   public interface f {
      dxi apply(dxi var1);

      default dxi.c a(dxi.c $$0) {
         return $$0;
      }
   }
}
