import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ecj {
   Codec<ecj> b = eck.b;
   Codec<jr<ecj>> c = akq.a(mc.aM, b);
   Codec<ecj> d = c.xmap(eck.j::new, $$0 -> (jr)($$0 instanceof eck.j $$1 ? $$1.j() : new jr.a<>($$0)));

   double a(ecj.b var1);

   void a(double[] var1, ecj.a var2);

   ecj a(ecj.f var1);

   double a();

   double b();

   ayr<? extends ecj> c();

   default ecj a(double $$0, double $$1) {
      return new eck.g(this, $$0, $$1);
   }

   default ecj d() {
      return eck.a(this, eck.k.a.a);
   }

   default ecj e() {
      return eck.a(this, eck.k.a.b);
   }

   default ecj f() {
      return eck.a(this, eck.k.a.c);
   }

   default ecj g() {
      return eck.a(this, eck.k.a.d);
   }

   default ecj h() {
      return eck.a(this, eck.k.a.e);
   }

   default ecj i() {
      return eck.a(this, eck.k.a.f);
   }

   public interface a {
      ecj.b a(int var1);

      void a(double[] var1, ecj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eds d() {
         return eds.a();
      }
   }

   public static record c(jr<esa.a> b, @Nullable esa c) {
      public static final Codec<ecj.c> a = esa.a.b.xmap($$0 -> new ecj.c($$0, null), ecj.c::b);

      public c(jr<esa.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ecj {
      @Override
      default void a(double[] $$0, ecj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ecj a(ecj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ecj.b {
   }

   public interface f {
      ecj apply(ecj var1);

      default ecj.c a(ecj.c $$0) {
         return $$0;
      }
   }
}
