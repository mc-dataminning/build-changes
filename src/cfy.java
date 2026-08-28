import javax.annotation.Nullable;

public class cfy extends cey implements bub, ckc {
   private static final akg<Byte> b = akk.a(cfy.class, aki.a);
   private static final byte c = 16;

   public cfy(bsv<? extends cfy> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbh(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cbv(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new caq(this, cms.class, 6.0F));
      this.bS.a(4, new cbd(this));
      this.bT.a(1, new ccb<>(this, btm.class, 10, true, false, $$0 -> $$0 instanceof cjq));
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 4.0).a(bus.r, 0.2F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(ur $$0) {
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
         if (this.dP().t(this.dp()).a(awk.ae)) {
            this.a(this.dQ().c(), 1.0F);
         }

         if (!this.dP().ab().b(dbp.c)) {
            return;
         }

         drx $$0 = dew.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayu.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayu.a(this.dw());
            int $$4 = ayu.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            iz $$5 = new iz($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dbw)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dwq.i, $$5, dwq.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btk $$0, float $$1) {
      cnp $$2 = new cnp(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avw.yD, 1.0F, 0.4F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.rV) && this.a()) {
         this.a(avx.h);
         this.a(dwq.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqp.a(this.dP().B);
      } else {
         return bqp.e;
      }
   }

   @Override
   public void a(avx $$0) {
      this.dP().a(null, this, avw.yE, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new cuk(cun.fl), this.cL());
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
   protected avv v() {
      return avw.yA;
   }

   @Nullable
   @Override
   protected avv d(bri $$0) {
      return avw.yC;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.yB;
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
