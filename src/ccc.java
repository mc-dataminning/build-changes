import javax.annotation.Nullable;

public class ccc extends cbc implements bqf, cge {
   private static final aim<Byte> b = aiq.a(ccc.class, aio.a);
   private static final byte c = 16;

   public ccc(bpd<? extends ccc> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxl(this, 1.25, 20, 10.0F));
      this.bR.a(2, new bxz(this, 1.0, 1.0000001E-5F));
      this.bR.a(3, new bwu(this, ciu.class, 6.0F));
      this.bR.a(4, new bxh(this));
      this.bS.a(1, new byf<>(this, bpr.class, 10, true, false, $$0 -> $$0 instanceof cfs));
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 4.0).a(bqw.r, 0.2F);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.s());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dM().B) {
         if (this.dM().t(this.dm()).a(aum.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Z().b(cwx.c)) {
            return;
         }

         dnb $$0 = dae.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aww.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aww.a(this.dt());
            int $$4 = aww.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ib $$5 = new ib($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((cxe)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(drp.i, $$5, drp.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bpp $$0, float $$1) {
      cjr $$2 = new cjr(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aty.yh, 1.0F, 0.4F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.rU) && this.a()) {
         this.a(atz.h);
         this.a(drp.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bnd.a(this.dM().B);
      } else {
         return bnd.d;
      }
   }

   @Override
   public void a(atz $$0) {
      this.dM().a(null, this, aty.yi, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         this.w(false);
         this.a(new cqm(cqp.fk), this.cI());
      }
   }

   @Override
   public boolean a() {
      return this.bA() && this.s();
   }

   public boolean s() {
      return (this.an.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(b);
      if ($$0) {
         this.an.a(b, (byte)($$1 | 16));
      } else {
         this.an.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected atx v() {
      return aty.ye;
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.yg;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.yf;
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
