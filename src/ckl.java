import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ckl extends cji {
   private static final ajv<Byte> e = ajz.a(ckl.class, ajx.a);
   protected int b;
   private ckl.a ca = ckl.a.a;

   protected ckl(bsw<? extends ckl> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cji.a s() {
      if (this.gw()) {
         return cji.a.c;
      } else {
         return this.gF() ? cji.a.g : cji.a.a;
      }
   }

   public boolean gw() {
      return this.dQ().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(ckl.a $$0) {
      this.ca = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected ckl.a gx() {
      return !this.dQ().B ? this.ca : ckl.a.a(this.ao.a(e));
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B && this.gw()) {
         ckl.a $$0 = this.gx();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayn.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayn.b($$4);
         float $$6 = ayn.a($$4);
         double $$7 = 0.6 * (double)this.ec();
         double $$8 = 1.8 * (double)this.ec();
         this.dQ().a(lf.a(lm.u, $$1, $$2, $$3), this.dv() + (double)$$5 * $$7, this.dx() + $$8, this.dB() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dQ().a(lf.a(lm.u, $$1, $$2, $$3), this.dv() - (double)$$5 * $$7, this.dx() + $$8, this.dB() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gy() {
      return this.b;
   }

   protected abstract avn gm();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ckl.a> g = axd.a($$0 -> $$0.h, values(), axd.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ckl.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cak {
      public b() {
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         return ckl.this.gy() > 0;
      }

      @Override
      public void d() {
         super.d();
         ckl.this.bT.n();
      }

      @Override
      public void e() {
         super.e();
         ckl.this.a(ckl.a.a);
      }

      @Override
      public void a() {
         if (ckl.this.p() != null) {
            ckl.this.F().a(ckl.this.p(), (float)ckl.this.ab(), (float)ckl.this.aa());
         }
      }
   }

   protected abstract class c extends cak {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         btl $$0 = ckl.this.p();
         if ($$0 == null || !$$0.bE()) {
            return false;
         } else {
            return ckl.this.gw() ? false : ckl.this.ai >= this.c;
         }
      }

      @Override
      public boolean c() {
         btl $$0 = ckl.this.p();
         return $$0 != null && $$0.bE() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         ckl.this.b = this.h();
         this.c = ckl.this.ai + this.i();
         avn $$0 = this.l();
         if ($$0 != null) {
            ckl.this.a($$0, 1.0F, 1.0F);
         }

         ckl.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ckl.this.a(ckl.this.gm(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avn l();

      protected abstract ckl.a m();
   }
}
