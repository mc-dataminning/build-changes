import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface egy {
   Codec<egy> b = egz.b;
   Codec<jg<egy>> c = alg.a(mi.aO, b);
   Codec<egy> d = c.xmap(egz.j::new, $$0 -> (jg)($$0 instanceof egz.j $$1 ? $$1.j() : new jg.a<>($$0)));

   double a(egy.b var1);

   void a(double[] var1, egy.a var2);

   egy a(egy.f var1);

   double a();

   double b();

   azj<? extends egy> c();

   default egy a(double $$0, double $$1) {
      return new egz.g(this, $$0, $$1);
   }

   default egy d() {
      return egz.a(this, egz.k.a.a);
   }

   default egy e() {
      return egz.a(this, egz.k.a.b);
   }

   default egy f() {
      return egz.a(this, egz.k.a.c);
   }

   default egy g() {
      return egz.a(this, egz.k.a.d);
   }

   default egy h() {
      return egz.a(this, egz.k.a.e);
   }

   default egy i() {
      return egz.a(this, egz.k.a.f);
   }

   public interface a {
      egy.b a(int var1);

      void a(double[] var1, egy var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eih d() {
         return eih.a();
      }
   }

   public static record c(jg<ewt.a> b, @Nullable ewt c) {
      public static final Codec<egy.c> a = ewt.a.b.xmap($$0 -> new egy.c($$0, null), egy.c::b);

      public c(jg<ewt.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends egy {
      @Override
      default void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default egy a(egy.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements egy.b {
   }

   public interface f {
      egy apply(egy var1);

      default egy.c a(egy.c $$0) {
         return $$0;
      }
   }
}
