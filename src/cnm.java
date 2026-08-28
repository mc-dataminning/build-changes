import javax.annotation.Nullable;

public class cnm extends cmn {
   private static final ajp<Byte> g = ajt.a(cnm.class, ajr.a);
   private static final ajp<Boolean> h = ajt.a(cnm.class, ajr.k);
   private boolean i;
   public int f;

   public cnm(bsj<? extends cnm> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnm(dcd $$0, bsy $$1, cua $$2) {
      super(bsj.bf, $$1, $$0, $$2, null);
      this.ao.a(g, this.c($$2));
      this.ao.a(h, $$2.x());
   }

   public cnm(dcd $$0, double $$1, double $$2, double $$3, cua $$4) {
      super(bsj.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.ao.a(g, this.c($$4));
      this.ao.a(h, $$4.x());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bsd $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dP().B && this.d == cmn.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.ao();
         } else {
            this.b(true);
            evz $$2 = $$0.bx().d(this.dn());
            this.p(this.du(), this.dw() + $$2.d * 0.015 * (double)$$1, this.dA());
            if (this.dP().B) {
               this.ae = this.dw();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.ds().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avf.zC, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bsd $$0 = this.s();
      return $$0 == null || !$$0.bD() ? false : !($$0 instanceof aql) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected evw a(evz $$0, evz $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(evw $$0) {
      bsd $$1 = $$0.a();
      float $$2 = 8.0F;
      bsd $$3 = this.s();
      bqw $$4 = this.dQ().a(this, (bsd)($$3 == null ? this : $$3));
      if (this.dP() instanceof aqk $$5) {
         $$2 = czl.a($$5, this.z(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ak() == bsj.H) {
            return;
         }

         if (this.dP() instanceof aqk $$6) {
            czl.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bsy $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.h(this.ds().d(-0.01, -0.1, -0.01));
      this.a(avf.zA, 1.0F, 1.0F);
   }

   @Override
   protected void a(aqk $$0, evv $$1, cua $$2) {
      czl.a($$0, $$2, this.s() instanceof bsy $$3 ? $$3 : null, this, null, $$1.e(), this::an);
   }

   @Override
   protected cua u() {
      return this.z();
   }

   @Override
   protected boolean a(cmh $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.fY().f(this.x());
   }

   @Override
   protected cua y() {
      return new cua(cud.vS);
   }

   @Override
   protected ave v() {
      return avf.zB;
   }

   @Override
   public void b_(cmh $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.ao.a(g, this.c(this.z()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cua $$0) {
      return this.dP() instanceof aqk $$1 ? (byte)aye.a(czl.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cmn.a.b || $$0 <= 0) {
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
