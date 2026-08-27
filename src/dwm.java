import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dwm {
   Codec<dwm> b = dwn.b;
   Codec<ix<dwm>> c = aki.a(lf.aD, b);
   Codec<dwm> d = c.xmap(dwn.j::new, $$0 -> (ix)($$0 instanceof dwn.j $$1 ? $$1.j() : new ix.a<>($$0)));

   double a(dwm.b var1);

   void a(double[] var1, dwm.a var2);

   dwm a(dwm.f var1);

   double a();

   double b();

   axx<? extends dwm> c();

   default dwm a(double $$0, double $$1) {
      return new dwn.g(this, $$0, $$1);
   }

   default dwm d() {
      return dwn.a(this, dwn.k.a.a);
   }

   default dwm e() {
      return dwn.a(this, dwn.k.a.b);
   }

   default dwm f() {
      return dwn.a(this, dwn.k.a.c);
   }

   default dwm g() {
      return dwn.a(this, dwn.k.a.d);
   }

   default dwm h() {
      return dwn.a(this, dwn.k.a.e);
   }

   default dwm i() {
      return dwn.a(this, dwn.k.a.f);
   }

   public interface a {
      dwm.b a(int var1);

      void a(double[] var1, dwm var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dxv d() {
         return dxv.a();
      }
   }

   public static record c(ix<elx.a> b, @Nullable elx c) {
      public static final Codec<dwm.c> a = elx.a.b.xmap($$0 -> new dwm.c($$0, null), dwm.c::b);

      public c(ix<elx.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dwm {
      @Override
      default void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dwm a(dwm.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dwm.b {
   }

   public interface f {
      dwm apply(dwm var1);

      default dwm.c a(dwm.c $$0) {
         return $$0;
      }
   }
}
