import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dut {
   Codec<dut> b = duu.b;
   Codec<in<dut>> c = ajr.a(ku.aA, b);
   Codec<dut> d = c.xmap(duu.j::new, $$0 -> (in)($$0 instanceof duu.j $$1 ? $$1.j() : new in.a<>($$0)));

   double a(dut.b var1);

   void a(double[] var1, dut.a var2);

   dut a(dut.f var1);

   double a();

   double b();

   axg<? extends dut> c();

   default dut a(double $$0, double $$1) {
      return new duu.g(this, $$0, $$1);
   }

   default dut d() {
      return duu.a(this, duu.k.a.a);
   }

   default dut e() {
      return duu.a(this, duu.k.a.b);
   }

   default dut f() {
      return duu.a(this, duu.k.a.c);
   }

   default dut g() {
      return duu.a(this, duu.k.a.d);
   }

   default dut h() {
      return duu.a(this, duu.k.a.e);
   }

   default dut i() {
      return duu.a(this, duu.k.a.f);
   }

   public interface a {
      dut.b a(int var1);

      void a(double[] var1, dut var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dwc d() {
         return dwc.a();
      }
   }

   public static record c(in<eke.a> b, @Nullable eke c) {
      public static final Codec<dut.c> a = eke.a.b.xmap($$0 -> new dut.c($$0, null), dut.c::b);

      public c(in<eke.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dut {
      @Override
      default void a(double[] $$0, dut.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dut a(dut.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dut.b {
   }

   public interface f {
      dut apply(dut var1);

      default dut.c a(dut.c $$0) {
         return $$0;
      }
   }
}
