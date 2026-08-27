import javax.annotation.Nullable;

public class cbk extends cak implements bpn, cfk {
   private static final aii<Byte> b = ail.a(cbk.class, aik.a);
   private static final byte c = 16;

   public cbk(bol<? extends cbk> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bwt(this, 1.25, 20, 10.0F));
      this.bP.a(2, new bxh(this, 1.0, 1.0000001E-5F));
      this.bP.a(3, new bwc(this, cia.class, 6.0F));
      this.bP.a(4, new bwp(this));
      this.bQ.a(1, new bxn<>(this, boz.class, 10, true, false, $$0 -> $$0 instanceof cey));
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 4.0).a(bqe.o, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, (byte)16);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fj() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B) {
         if (this.dJ().t(this.dj()).a(aud.ae)) {
            this.a(this.dK().c(), 1.0F);
         }

         if (!this.dJ().Z().b(cwa.c)) {
            return;
         }

         dme $$0 = czh.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = awm.a(this.do() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = awm.a(this.dq());
            int $$4 = awm.a(this.du() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ib $$5 = new ib($$2, $$3, $$4);
            if (this.dJ().a_($$5).i() && $$0.a((cwh)this.dJ(), $$5)) {
               this.dJ().b($$5, $$0);
               this.dJ().a(dqr.i, $$5, dqr.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(box $$0, float $$1) {
      cix $$2 = new cix(this.dJ(), this);
      double $$3 = $$0.ds() - 1.1F;
      double $$4 = $$0.do() - this.do();
      double $$5 = $$3 - $$2.dq();
      double $$6 = $$0.du() - this.du();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(atp.xZ, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dJ().b($$2);
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.rU) && this.a()) {
         this.a(atq.h);
         this.a(dqr.M, $$0);
         if (!this.dJ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bml.a(this.dJ().B);
      } else {
         return bml.d;
      }
   }

   @Override
   public void a(atq $$0) {
      this.dJ().a(null, this, atp.ya, $$0, 1.0F, 1.0F);
      if (!this.dJ().y_()) {
         this.w(false);
         this.a(new cpq(cpt.fk), this.cF());
      }
   }

   @Override
   public boolean a() {
      return this.bx() && this.w();
   }

   public boolean w() {
      return (this.am.b(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(b);
      if ($$0) {
         this.am.b(b, (byte)($$1 | 16));
      } else {
         this.am.b(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected ato y() {
      return atp.xW;
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.xY;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.xX;
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.75F * this.cF()), (double)(this.dd() * 0.4F));
   }
}
