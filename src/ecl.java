import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ecl {
   Codec<ecl> b = ecm.b;
   Codec<jr<ecl>> c = akq.a(mc.aM, b);
   Codec<ecl> d = c.xmap(ecm.j::new, $$0 -> (jr)($$0 instanceof ecm.j $$1 ? $$1.j() : new jr.a<>($$0)));

   double a(ecl.b var1);

   void a(double[] var1, ecl.a var2);

   ecl a(ecl.f var1);

   double a();

   double b();

   ays<? extends ecl> c();

   default ecl a(double $$0, double $$1) {
      return new ecm.g(this, $$0, $$1);
   }

   default ecl d() {
      return ecm.a(this, ecm.k.a.a);
   }

   default ecl e() {
      return ecm.a(this, ecm.k.a.b);
   }

   default ecl f() {
      return ecm.a(this, ecm.k.a.c);
   }

   default ecl g() {
      return ecm.a(this, ecm.k.a.d);
   }

   default ecl h() {
      return ecm.a(this, ecm.k.a.e);
   }

   default ecl i() {
      return ecm.a(this, ecm.k.a.f);
   }

   public interface a {
      ecl.b a(int var1);

      void a(double[] var1, ecl var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default edu d() {
         return edu.a();
      }
   }

   public static record c(jr<esc.a> b, @Nullable esc c) {
      public static final Codec<ecl.c> a = esc.a.b.xmap($$0 -> new ecl.c($$0, null), ecl.c::b);

      public c(jr<esc.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ecl {
      @Override
      default void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ecl a(ecl.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ecl.b {
   }

   public interface f {
      ecl apply(ecl var1);

      default ecl.c a(ecl.c $$0) {
         return $$0;
      }
   }
}
