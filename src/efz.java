import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface efz {
   Codec<efz> b = ega.b;
   Codec<je<efz>> c = alc.a(mg.aO, b);
   Codec<efz> d = c.xmap(ega.j::new, $$0 -> (je)($$0 instanceof ega.j $$1 ? $$1.j() : new je.a<>($$0)));

   double a(efz.b var1);

   void a(double[] var1, efz.a var2);

   efz a(efz.f var1);

   double a();

   double b();

   azf<? extends efz> c();

   default efz a(double $$0, double $$1) {
      return new ega.g(this, $$0, $$1);
   }

   default efz d() {
      return ega.a(this, ega.k.a.a);
   }

   default efz e() {
      return ega.a(this, ega.k.a.b);
   }

   default efz f() {
      return ega.a(this, ega.k.a.c);
   }

   default efz g() {
      return ega.a(this, ega.k.a.d);
   }

   default efz h() {
      return ega.a(this, ega.k.a.e);
   }

   default efz i() {
      return ega.a(this, ega.k.a.f);
   }

   public interface a {
      efz.b a(int var1);

      void a(double[] var1, efz var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ehi d() {
         return ehi.a();
      }
   }

   public static record c(je<evr.a> b, @Nullable evr c) {
      public static final Codec<efz.c> a = evr.a.b.xmap($$0 -> new efz.c($$0, null), efz.c::b);

      public c(je<evr.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends efz {
      @Override
      default void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default efz a(efz.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements efz.b {
   }

   public interface f {
      efz apply(efz var1);

      default efz.c a(efz.c $$0) {
         return $$0;
      }
   }
}
