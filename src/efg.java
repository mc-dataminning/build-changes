import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface efg {
   Codec<efg> b = efh.b;
   Codec<je<efg>> c = ala.a(mg.aM, b);
   Codec<efg> d = c.xmap(efh.j::new, $$0 -> (je)($$0 instanceof efh.j $$1 ? $$1.j() : new je.a<>($$0)));

   double a(efg.b var1);

   void a(double[] var1, efg.a var2);

   efg a(efg.f var1);

   double a();

   double b();

   azd<? extends efg> c();

   default efg a(double $$0, double $$1) {
      return new efh.g(this, $$0, $$1);
   }

   default efg d() {
      return efh.a(this, efh.k.a.a);
   }

   default efg e() {
      return efh.a(this, efh.k.a.b);
   }

   default efg f() {
      return efh.a(this, efh.k.a.c);
   }

   default efg g() {
      return efh.a(this, efh.k.a.d);
   }

   default efg h() {
      return efh.a(this, efh.k.a.e);
   }

   default efg i() {
      return efh.a(this, efh.k.a.f);
   }

   public interface a {
      efg.b a(int var1);

      void a(double[] var1, efg var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default egp d() {
         return egp.a();
      }
   }

   public static record c(je<euy.a> b, @Nullable euy c) {
      public static final Codec<efg.c> a = euy.a.b.xmap($$0 -> new efg.c($$0, null), efg.c::b);

      public c(je<euy.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends efg {
      @Override
      default void a(double[] $$0, efg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default efg a(efg.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements efg.b {
   }

   public interface f {
      efg apply(efg var1);

      default efg.c a(efg.c $$0) {
         return $$0;
      }
   }
}
