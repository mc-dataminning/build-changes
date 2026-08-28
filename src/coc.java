import javax.annotation.Nullable;

public class coc extends cnd {
   private static final ajw<Byte> g = aka.a(coc.class, ajy.a);
   private static final ajw<Boolean> h = aka.a(coc.class, ajy.k);
   private boolean i;
   public int f;

   public coc(bsx<? extends coc> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public coc(dcw $$0, btn $$1, cuq $$2) {
      super(bsx.bf, $$1, $$0, $$2, null);
      this.ao.a(g, this.c($$2));
      this.ao.a(h, $$2.x());
   }

   public coc(dcw $$0, double $$1, double $$2, double $$3, cuq $$4) {
      super(bsx.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.ao.a(g, this.c($$4));
      this.ao.a(h, $$4.x());
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bsr $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.E()) && $$0 != null) {
         if (!this.J()) {
            if (!this.dP().B && this.d == cnd.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.aq();
         } else {
            this.b(true);
            exa $$2 = $$0.by().d(this.dn());
            this.o(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.i(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avp.zC, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean J() {
      bsr $$0 = this.s();
      return $$0 == null || !$$0.bE() ? false : !($$0 instanceof aqv) || !$$0.R_();
   }

   @Override
   public boolean F() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected ewx a(exa $$0, exa $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ewx $$0) {
      bsr $$1 = $$0.a();
      float $$2 = 8.0F;
      bsr $$3 = this.s();
      brk $$4 = this.dQ().a(this, (bsr)($$3 == null ? this : $$3));
      if (this.dP() instanceof aqu $$5) {
         $$2 = dae.a($$5, this.dT(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.am() == bsx.H) {
            return;
         }

         if (this.dP() instanceof aqu $$6) {
            dae.a($$6, $$1, $$4, this.dT());
         }

         if ($$1 instanceof btn $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.i(this.ds().d(-0.01, -0.1, -0.01));
      this.a(avp.zA, 1.0F, 1.0F);
   }

   @Override
   protected void a(aqu $$0, eww $$1, cuq $$2) {
      exa $$3 = $$1.a().a($$1.e());
      dae.a($$0, $$2, this.s() instanceof btn $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.a()), $$0x -> this.ap());
   }

   @Override
   public cuq dT() {
      return this.y();
   }

   @Override
   protected boolean a(cmx $$0) {
      return super.a($$0) || this.E() && this.e($$0) && $$0.fZ().f(this.w());
   }

   @Override
   protected cuq x() {
      return new cuq(cut.vS);
   }

   @Override
   protected avo t() {
      return avp.zB;
   }

   @Override
   public void b_(cmx $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, this.c(this.y()));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cuq $$0) {
      return this.dP() instanceof aqu $$1 ? (byte)ayo.a(dae.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cnd.a.b || $$0 <= 0) {
         super.p();
      }
   }

   @Override
   protected float D() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
