import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dxl {
   Codec<dxl> b = dxm.b;
   Codec<ji<dxl>> c = ala.a(lq.aD, b);
   Codec<dxl> d = c.xmap(dxm.j::new, $$0 -> (ji)($$0 instanceof dxm.j $$1 ? $$1.j() : new ji.a<>($$0)));

   double a(dxl.b var1);

   void a(double[] var1, dxl.a var2);

   dxl a(dxl.f var1);

   double a();

   double b();

   ayq<? extends dxl> c();

   default dxl a(double $$0, double $$1) {
      return new dxm.g(this, $$0, $$1);
   }

   default dxl d() {
      return dxm.a(this, dxm.k.a.a);
   }

   default dxl e() {
      return dxm.a(this, dxm.k.a.b);
   }

   default dxl f() {
      return dxm.a(this, dxm.k.a.c);
   }

   default dxl g() {
      return dxm.a(this, dxm.k.a.d);
   }

   default dxl h() {
      return dxm.a(this, dxm.k.a.e);
   }

   default dxl i() {
      return dxm.a(this, dxm.k.a.f);
   }

   public interface a {
      dxl.b a(int var1);

      void a(double[] var1, dxl var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dyu d() {
         return dyu.a();
      }
   }

   public static record c(ji<emw.a> b, @Nullable emw c) {
      public static final Codec<dxl.c> a = emw.a.b.xmap($$0 -> new dxl.c($$0, null), dxl.c::b);

      public c(ji<emw.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dxl {
      @Override
      default void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dxl a(dxl.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dxl.b {
   }

   public interface f {
      dxl apply(dxl var1);

      default dxl.c a(dxl.c $$0) {
         return $$0;
      }
   }
}
