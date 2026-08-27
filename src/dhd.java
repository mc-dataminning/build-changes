import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dhd {
   Codec<dhd> b = dhe.b;
   Codec<he<dhd>> c = acm.a(jc.at, b);
   Codec<dhd> d = c.xmap(dhe.j::new, $$0 -> (he)($$0 instanceof dhe.j $$1 ? $$1.j() : new he.a<>($$0)));

   double a(dhd.b var1);

   void a(double[] var1, dhd.a var2);

   dhd a(dhd.f var1);

   double a();

   double b();

   aou<? extends dhd> c();

   default dhd a(double $$0, double $$1) {
      return new dhe.g(this, $$0, $$1);
   }

   default dhd d() {
      return dhe.a(this, dhe.k.a.a);
   }

   default dhd e() {
      return dhe.a(this, dhe.k.a.b);
   }

   default dhd f() {
      return dhe.a(this, dhe.k.a.c);
   }

   default dhd g() {
      return dhe.a(this, dhe.k.a.d);
   }

   default dhd h() {
      return dhe.a(this, dhe.k.a.e);
   }

   default dhd i() {
      return dhe.a(this, dhe.k.a.f);
   }

   public interface a {
      dhd.b a(int var1);

      void a(double[] var1, dhd var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dim d() {
         return dim.a();
      }
   }

   public static record c(he<dwh.a> b, @Nullable dwh c) {
      public static final Codec<dhd.c> a = dwh.a.b.xmap($$0 -> new dhd.c($$0, null), dhd.c::b);

      public c(he<dwh.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dhd {
      @Override
      default void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dhd a(dhd.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dhd.b {
   }

   public interface f {
      dhd apply(dhd var1);

      default dhd.c a(dhd.c $$0) {
         return $$0;
      }
   }
}
