import javax.annotation.Nullable;

public class cgf extends cff implements bui, ckj {
   private static final akk<Byte> b = ako.a(cgf.class, akm.a);
   private static final byte c = 16;

   public cgf(btc<? extends cgf> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbo(this, 1.25, 20, 10.0F));
      this.bS.a(2, new ccc(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cax(this, cmz.class, 6.0F));
      this.bS.a(4, new cbk(this));
      this.bT.a(1, new cci<>(this, btt.class, 10, true, false, $$0 -> $$0 instanceof cjx));
   }

   public static buy.a s() {
      return btt.A().a(buz.q, 4.0).a(buz.r, 0.2F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.dP().t(this.dp()).a(awo.ae)) {
            this.a(this.dQ().c(), 1.0F);
         }

         if (!this.dP().ab().b(dbw.c)) {
            return;
         }

         dse $$0 = dfd.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayz.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayz.a(this.dw());
            int $$4 = ayz.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            iz $$5 = new iz($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dcd)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dwx.i, $$5, dwx.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btr $$0, float $$1) {
      cnw $$2 = new cnw(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(awa.yD, 1.0F, 0.4F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.rV) && this.a()) {
         this.a(awb.h);
         this.a(dwx.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqw.a(this.dP().B);
      } else {
         return bqw.e;
      }
   }

   @Override
   public void a(awb $$0) {
      this.dP().a(null, this, awa.yE, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new cur(cuu.fl), this.cL());
      }
   }

   @Override
   public boolean a() {
      return this.bD() && this.u();
   }

   public boolean u() {
      return (this.ao.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         this.ao.a(b, (byte)($$1 | 16));
      } else {
         this.ao.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avz v() {
      return awa.yA;
   }

   @Nullable
   @Override
   protected avz d(brp $$0) {
      return awa.yC;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.yB;
   }

   @Override
   public evt cM() {
      return new evt(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
