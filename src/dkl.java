import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkl {
   Codec<dkl> b = dkm.b;
   Codec<hg<dkl>> c = aet.a(je.at, b);
   Codec<dkl> d = c.xmap(dkm.j::new, $$0 -> (hg)($$0 instanceof dkm.j $$1 ? $$1.j() : new hg.a<>($$0)));

   double a(dkl.b var1);

   void a(double[] var1, dkl.a var2);

   dkl a(dkl.f var1);

   double a();

   double b();

   arr<? extends dkl> c();

   default dkl a(double $$0, double $$1) {
      return new dkm.g(this, $$0, $$1);
   }

   default dkl d() {
      return dkm.a(this, dkm.k.a.a);
   }

   default dkl e() {
      return dkm.a(this, dkm.k.a.b);
   }

   default dkl f() {
      return dkm.a(this, dkm.k.a.c);
   }

   default dkl g() {
      return dkm.a(this, dkm.k.a.d);
   }

   default dkl h() {
      return dkm.a(this, dkm.k.a.e);
   }

   default dkl i() {
      return dkm.a(this, dkm.k.a.f);
   }

   public interface a {
      dkl.b a(int var1);

      void a(double[] var1, dkl var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlu d() {
         return dlu.a();
      }
   }

   public static record c(hg<dzp.a> b, @Nullable dzp c) {
      public static final Codec<dkl.c> a = dzp.a.b.xmap($$0 -> new dkl.c($$0, null), dkl.c::b);

      public c(hg<dzp.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkl {
      @Override
      default void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkl a(dkl.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkl.b {
   }

   public interface f {
      dkl apply(dkl var1);

      default dkl.c a(dkl.c $$0) {
         return $$0;
      }
   }
}
