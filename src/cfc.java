import javax.annotation.Nullable;

public class cfc extends cec implements bte, cji {
   private static final ajy<Byte> b = akc.a(cfc.class, aka.a);
   private static final byte c = 16;

   public cfc(bsb<? extends cfc> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      this.cb.a(1, new cak(this, 1.25, 20, 10.0F));
      this.cb.a(2, new cay(this, 1.0, 1.0000001E-5F));
      this.cb.a(3, new bzt(this, cly.class, 6.0F));
      this.cb.a(4, new cag(this));
      this.cc.a(1, new cbe<>(this, bsq.class, 10, true, false, $$0 -> $$0 instanceof ciu));
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 4.0).a(btv.r, 0.2F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fy() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C) {
         if (this.dU().t(this.du()).a(awd.ai)) {
            this.a(this.dX().c(), 1.0F);
         }

         if (!this.dU().ab().b(dbw.c)) {
            return;
         }

         dtc $$0 = dfe.eB.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aym.a(this.dz() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aym.a(this.dB());
            int $$4 = aym.a(this.dF() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ir $$5 = new ir($$2, $$3, $$4);
            if (this.dU().a_($$5).i() && $$0.a((dcd)this.dU(), $$5)) {
               this.dU().b($$5, $$0);
               this.dU().a(dxv.i, $$5, dxv.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bso $$0, float $$1) {
      cmx $$2 = new cmx(this.dU(), this);
      double $$3 = $$0.dD() - 1.1F;
      double $$4 = $$0.dz() - this.dz();
      double $$5 = $$3 - $$2.dB();
      double $$6 = $$0.dF() - this.dF();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avo.zb, 1.0F, 0.4F / (this.et().i() * 0.4F + 0.8F));
      this.dU().b($$2);
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.ts) && this.a()) {
         this.a(avq.h);
         this.a(dxv.M, $$0);
         if (!this.dU().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bqa.a(this.dU().C);
      } else {
         return bqa.d;
      }
   }

   @Override
   public void a(avq $$0) {
      this.dU().a(null, this, avo.zc, $$0, 1.0F, 1.0F);
      if (!this.dU().x_()) {
         this.w(false);
         this.a(new cuh(cuk.gw), this.cQ());
      }
   }

   @Override
   public boolean a() {
      return this.bI() && this.t();
   }

   public boolean t() {
      return (this.as.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.as.a(b);
      if ($$0) {
         this.as.a(b, (byte)($$1 | 16));
      } else {
         this.as.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avn u() {
      return avo.yY;
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.za;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.yZ;
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.75F * this.cQ()), (double)(this.do() * 0.4F));
   }
}
