import javax.annotation.Nullable;

public class cnp extends cmq {
   private static final ajp<Byte> g = ajt.a(cnp.class, ajr.a);
   private static final ajp<Boolean> h = ajt.a(cnp.class, ajr.k);
   private boolean i;
   public int f;

   public cnp(bsm<? extends cnp> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnp(dcf $$0, btb $$1, cuc $$2) {
      super(bsm.bf, $$1, $$0, $$2, null);
      this.ao.a(g, this.c($$2));
      this.ao.a(h, $$2.x());
   }

   public cnp(dcf $$0, double $$1, double $$2, double $$3, cuc $$4) {
      super(bsm.bf, $$1, $$2, $$3, $$0, $$4, $$4);
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

      bsg $$0 = this.s();
      int $$1 = this.ao.a(g);
      if ($$1 > 0 && (this.i || this.G()) && $$0 != null) {
         if (!this.K()) {
            if (!this.dQ().B && this.d == cmq.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.ap();
         } else {
            this.b(true);
            ewf $$2 = $$0.by().d(this.do());
            this.p(this.dv(), this.dx() + $$2.d * 0.015 * (double)$$1, this.dB());
            if (this.dQ().B) {
               this.ae = this.dx();
            }

            double $$3 = 0.05 * (double)$$1;
            this.i(this.dt().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(avh.zC, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean K() {
      bsg $$0 = this.s();
      return $$0 == null || !$$0.bE() ? false : !($$0 instanceof aqn) || !$$0.N_();
   }

   @Override
   public boolean H() {
      return this.ao.a(h);
   }

   @Nullable
   @Override
   protected ewc a(ewf $$0, ewf $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(ewc $$0) {
      bsg $$1 = $$0.a();
      float $$2 = 8.0F;
      bsg $$3 = this.s();
      bqz $$4 = this.dR().a(this, (bsg)($$3 == null ? this : $$3));
      if (this.dQ() instanceof aqm $$5) {
         $$2 = czn.a($$5, this.z(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.al() == bsm.H) {
            return;
         }

         if (this.dQ() instanceof aqm $$6) {
            czn.a($$6, $$1, $$4);
         }

         if ($$1 instanceof btb $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.i(this.dt().d(-0.01, -0.1, -0.01));
      this.a(avh.zA, 1.0F, 1.0F);
   }

   @Override
   protected void a(aqm $$0, ewb $$1, cuc $$2) {
      czn.a($$0, $$2, this.s() instanceof btb $$3 ? $$3 : null, this, null, $$1.e(), this::ao);
   }

   @Override
   protected cuc u() {
      return this.z();
   }

   @Override
   protected boolean a(cmk $$0) {
      return super.a($$0) || this.G() && this.e($$0) && $$0.fZ().f(this.x());
   }

   @Override
   protected cuc y() {
      return new cuc(cuf.vS);
   }

   @Override
   protected avg v() {
      return avh.zB;
   }

   @Override
   public void b_(cmk $$0) {
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

   private byte c(cuc $$0) {
      return this.dQ() instanceof aqm $$1 ? (byte)ayg.a(czn.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void p() {
      int $$0 = this.ao.a(g);
      if (this.d != cmq.a.b || $$0 <= 0) {
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
