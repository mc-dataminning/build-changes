import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class coa extends cnb {
   private static final ajv<Byte> g = ajz.a(coa.class, ajx.a);
   private static final ajv<Boolean> h = ajz.a(coa.class, ajx.k);
   private boolean i;
   public int f;

   public coa(bsw<? extends coa> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public coa(dcu $$0, btl $$1, cuo $$2) {
      super(bsw.bf, $$1, $$0, $$2, null);
      this.ao.a(g, this.c($$2));
      this.ao.a(h, $$2.x());
   }

   public coa(dcu $$0, double $$1, double $$2, double $$3, cuo $$4) {
      super(bsw.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.ao.a(g, this.c($$4));
      this.ao.a(h, $$4.x());
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bsq $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.F()) && $$0 != null) {
         if (!this.L()) {
            if (!this.dQ().B && this.d == cnb.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.aq();
         } else {
            this.b(true);
            eww $$2 = $$0.by().d(this.do());
            this.o(this.dv(), this.dx() + $$2.d * 0.015 * (double)$$1, this.dB());
            if (this.dQ().B) {
               this.ae = this.dx();
            }

            double $$3 = 0.05 * (double)$$1;
            this.i(this.dt().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avo.zC, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean L() {
      bsq $$0 = this.s();
      return $$0 == null || !$$0.bE() ? false : !($$0 instanceof aqu) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected ewt a(eww $$0, eww $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ewt $$0) {
      bsq $$1 = $$0.a();
      float $$2 = 8.0F;
      bsq $$3 = this.s();
      brj $$4 = this.dR().a(this, (bsq)($$3 == null ? this : $$3));
      if (this.dQ() instanceof aqt $$5) {
         $$2 = dac.a($$5, this.t(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.am() == bsw.H) {
            return;
         }

         if (this.dQ() instanceof aqt $$6) {
            dac.a($$6, $$1, $$4, this.t());
         }

         if ($$1 instanceof btl $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.i(this.dt().d(-0.01, -0.1, -0.01));
      this.a(avo.zA, 1.0F, 1.0F);
   }

   @Override
   protected void a(aqt $$0, ews $$1, cuo $$2) {
      eww $$3 = $$1.a().a($$1.e());
      dac.a($$0, $$2, this.s() instanceof btl $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.a()), $$0x -> this.ap());
   }

   @Nonnull
   @Override
   protected cuo t() {
      return this.z();
   }

   @Override
   protected boolean a(cmv $$0) {
      return super.a($$0) || this.F() && this.e($$0) && $$0.fZ().f(this.x());
   }

   @Override
   protected cuo y() {
      return new cuo(cur.vS);
   }

   @Override
   protected avn v() {
      return avo.zB;
   }

   @Override
   public void b_(cmv $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, this.c(this.z()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cuo $$0) {
      return this.dQ() instanceof aqt $$1 ? (byte)ayn.a(dac.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cnb.a.b || $$0 <= 0) {
         super.p();
      }
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
