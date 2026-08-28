import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class coy extends cnu {
   private static final akj<Byte> a = akn.a(coy.class, akl.a);
   protected int b;
   private coy.a bG = coy.a.a;

   protected coy(bwr<? extends coy> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.f("SpellTicks");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cnu.a j() {
      if (this.gA()) {
         return cnu.a.c;
      } else {
         return this.gJ() ? cnu.a.g : cnu.a.a;
      }
   }

   public boolean gA() {
      return this.dU().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(coy.a $$0) {
      this.bG = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected coy.a gB() {
      return !this.dU().C ? this.bG : coy.a.a(this.al.a(a));
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C && this.gA()) {
         coy.a $$0 = this.gB();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azm.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azm.b($$4);
         float $$6 = azm.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dU().a(lr.a(ly.u, $$1, $$2, $$3), this.dz() + (double)$$5 * $$7, this.dB() + $$8, this.dF() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dU().a(lr.a(ly.u, $$1, $$2, $$3), this.dz() - (double)$$5 * $$7, this.dB() + $$8, this.dF() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gC() {
      return this.b;
   }

   protected abstract awm q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<coy.a> g = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static coy.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cef {
      public b() {
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         return coy.this.gC() > 0;
      }

      @Override
      public void d() {
         super.d();
         coy.this.bC.m();
      }

      @Override
      public void e() {
         super.e();
         coy.this.a(coy.a.a);
      }

      @Override
      public void a() {
         if (coy.this.f() != null) {
            coy.this.J().a(coy.this.f(), (float)coy.this.af(), (float)coy.this.ad());
         }
      }
   }

   protected abstract class c extends cef {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bxj $$0 = coy.this.f();
         if ($$0 == null || !$$0.bI()) {
            return false;
         } else {
            return coy.this.gA() ? false : coy.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bxj $$0 = coy.this.f();
         return $$0 != null && $$0.bI() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         coy.this.b = this.h();
         this.c = coy.this.af + this.i();
         awm $$0 = this.l();
         if ($$0 != null) {
            coy.this.a($$0, 1.0F, 1.0F);
         }

         coy.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            coy.this.a(coy.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awm l();

      protected abstract coy.a m();
   }
}
