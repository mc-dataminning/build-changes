import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface egw {
   Codec<egw> b = egx.b;
   Codec<jf<egw>> c = ale.a(mh.aO, b);
   Codec<egw> d = c.xmap(egx.j::new, $$0 -> (jf)($$0 instanceof egx.j $$1 ? $$1.j() : new jf.a<>($$0)));

   double a(egw.b var1);

   void a(double[] var1, egw.a var2);

   egw a(egw.f var1);

   double a();

   double b();

   azh<? extends egw> c();

   default egw a(double $$0, double $$1) {
      return new egx.g(this, $$0, $$1);
   }

   default egw d() {
      return egx.a(this, egx.k.a.a);
   }

   default egw e() {
      return egx.a(this, egx.k.a.b);
   }

   default egw f() {
      return egx.a(this, egx.k.a.c);
   }

   default egw g() {
      return egx.a(this, egx.k.a.d);
   }

   default egw h() {
      return egx.a(this, egx.k.a.e);
   }

   default egw i() {
      return egx.a(this, egx.k.a.f);
   }

   public interface a {
      egw.b a(int var1);

      void a(double[] var1, egw var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eif d() {
         return eif.a();
      }
   }

   public static record c(jf<ewr.a> b, @Nullable ewr c) {
      public static final Codec<egw.c> a = ewr.a.b.xmap($$0 -> new egw.c($$0, null), egw.c::b);

      public c(jf<ewr.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends egw {
      @Override
      default void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default egw a(egw.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements egw.b {
   }

   public interface f {
      egw apply(egw var1);

      default egw.c a(egw.c $$0) {
         return $$0;
      }
   }
}
