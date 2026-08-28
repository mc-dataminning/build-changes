import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eas {
   Codec<eas> b = eat.b;
   Codec<jp<eas>> c = ald.a(ly.aK, b);
   Codec<eas> d = c.xmap(eat.j::new, $$0 -> (jp)($$0 instanceof eat.j $$1 ? $$1.j() : new jp.a<>($$0)));

   double a(eas.b var1);

   void a(double[] var1, eas.a var2);

   eas a(eas.f var1);

   double a();

   double b();

   azc<? extends eas> c();

   default eas a(double $$0, double $$1) {
      return new eat.g(this, $$0, $$1);
   }

   default eas d() {
      return eat.a(this, eat.k.a.a);
   }

   default eas e() {
      return eat.a(this, eat.k.a.b);
   }

   default eas f() {
      return eat.a(this, eat.k.a.c);
   }

   default eas g() {
      return eat.a(this, eat.k.a.d);
   }

   default eas h() {
      return eat.a(this, eat.k.a.e);
   }

   default eas i() {
      return eat.a(this, eat.k.a.f);
   }

   public interface a {
      eas.b a(int var1);

      void a(double[] var1, eas var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ecb d() {
         return ecb.a();
      }
   }

   public static record c(jp<eqh.a> b, @Nullable eqh c) {
      public static final Codec<eas.c> a = eqh.a.b.xmap($$0 -> new eas.c($$0, null), eas.c::b);

      public c(jp<eqh.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends eas {
      @Override
      default void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default eas a(eas.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements eas.b {
   }

   public interface f {
      eas apply(eas var1);

      default eas.c a(eas.c $$0) {
         return $$0;
      }
   }
}
