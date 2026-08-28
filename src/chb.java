import javax.annotation.Nullable;

public class chb extends cga implements bvd, clh {
   private static final akh<Byte> b = akl.a(chb.class, akj.a);
   private static final byte c = 16;

   public chb(bty<? extends chb> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccj(this, 1.25, 20, 10.0F));
      this.bS.a(2, new ccx(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cbs(this, cnx.class, 6.0F));
      this.bS.a(4, new ccf(this));
      this.bT.a(1, new cdd<>(this, bup.class, 10, true, false, $$0 -> $$0 instanceof ckv));
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 4.0).a(bvu.v, 0.2F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B) {
         if (this.dS().t(this.ds()).a(awu.ae)) {
            this.a(this.dT().d(), 1.0F);
         }

         if (!this.dS().ac().b(def.c)) {
            return;
         }

         dus $$0 = dho.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azf.a(this.dx() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azf.a(this.dz());
            int $$4 = azf.a(this.dD() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jf $$5 = new jf($$2, $$3, $$4);
            if (this.dS().a_($$5).l() && $$0.a((dem)this.dS(), $$5)) {
               this.dS().b($$5, $$0);
               this.dS().a(dzp.i, $$5, dzp.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bun $$0, float $$1) {
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.dB() - 1.1F;
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arj $$6) {
         cvs $$7 = new cvs(cvw.qD);
         cor.a(new cow($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dz(), $$4, 1.6F, 12.0F));
      }

      this.a(awg.yM, 1.0F, 0.4F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.rW) && this.a()) {
         this.a(awh.h);
         this.a(dzp.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   public void a(awh $$0) {
      this.dS().a(null, this, awg.yN, $$0, 1.0F, 1.0F);
      if (!this.dS().x_()) {
         this.x(false);
         this.a(eth.aQ, $$0x -> this.a($$0x, this.cP()));
      }
   }

   @Override
   public boolean a() {
      return this.bI() && this.t();
   }

   public boolean t() {
      return (this.am.a(b) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         this.am.a(b, (byte)($$1 | 16));
      } else {
         this.am.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awf w() {
      return awg.yJ;
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.yL;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.yK;
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.75F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
