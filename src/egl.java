import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface egl {
   Codec<egl> b = egm.b;
   Codec<jf<egl>> c = alc.a(mh.aO, b);
   Codec<egl> d = c.xmap(egm.j::new, $$0 -> (jf)($$0 instanceof egm.j $$1 ? $$1.j() : new jf.a<>($$0)));

   double a(egl.b var1);

   void a(double[] var1, egl.a var2);

   egl a(egl.f var1);

   double a();

   double b();

   azf<? extends egl> c();

   default egl a(double $$0, double $$1) {
      return new egm.g(this, $$0, $$1);
   }

   default egl d() {
      return egm.a(this, egm.k.a.a);
   }

   default egl e() {
      return egm.a(this, egm.k.a.b);
   }

   default egl f() {
      return egm.a(this, egm.k.a.c);
   }

   default egl g() {
      return egm.a(this, egm.k.a.d);
   }

   default egl h() {
      return egm.a(this, egm.k.a.e);
   }

   default egl i() {
      return egm.a(this, egm.k.a.f);
   }

   public interface a {
      egl.b a(int var1);

      void a(double[] var1, egl var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ehu d() {
         return ehu.a();
      }
   }

   public static record c(jf<ewd.a> b, @Nullable ewd c) {
      public static final Codec<egl.c> a = ewd.a.b.xmap($$0 -> new egl.c($$0, null), egl.c::b);

      public c(jf<ewd.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends egl {
      @Override
      default void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default egl a(egl.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements egl.b {
   }

   public interface f {
      egl apply(egl var1);

      default egl.c a(egl.c $$0) {
         return $$0;
      }
   }
}
