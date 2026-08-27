import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface duk {
   Codec<duk> b = dul.b;
   Codec<il<duk>> c = ajp.a(ks.az, b);
   Codec<duk> d = c.xmap(dul.j::new, $$0 -> (il)($$0 instanceof dul.j $$1 ? $$1.j() : new il.a<>($$0)));

   double a(duk.b var1);

   void a(double[] var1, duk.a var2);

   duk a(duk.f var1);

   double a();

   double b();

   axe<? extends duk> c();

   default duk a(double $$0, double $$1) {
      return new dul.g(this, $$0, $$1);
   }

   default duk d() {
      return dul.a(this, dul.k.a.a);
   }

   default duk e() {
      return dul.a(this, dul.k.a.b);
   }

   default duk f() {
      return dul.a(this, dul.k.a.c);
   }

   default duk g() {
      return dul.a(this, dul.k.a.d);
   }

   default duk h() {
      return dul.a(this, dul.k.a.e);
   }

   default duk i() {
      return dul.a(this, dul.k.a.f);
   }

   public interface a {
      duk.b a(int var1);

      void a(double[] var1, duk var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dvt d() {
         return dvt.a();
      }
   }

   public static record c(il<ejv.a> b, @Nullable ejv c) {
      public static final Codec<duk.c> a = ejv.a.b.xmap($$0 -> new duk.c($$0, null), duk.c::b);

      public c(il<ejv.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends duk {
      @Override
      default void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default duk a(duk.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements duk.b {
   }

   public interface f {
      duk apply(duk var1);

      default duk.c a(duk.c $$0) {
         return $$0;
      }
   }
}
