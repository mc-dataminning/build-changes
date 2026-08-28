import javax.annotation.Nullable;

public class cfq extends ceq implements btt, cjv {
   private static final ajp<Byte> b = ajt.a(cfq.class, ajr.a);
   private static final byte c = 16;

   public cfq(bsn<? extends cfq> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new caz(this, 1.25, 20, 10.0F));
      this.bU.a(2, new cbn(this, 1.0, 1.0000001E-5F));
      this.bU.a(3, new cai(this, cml.class, 6.0F));
      this.bU.a(4, new cav(this));
      this.bV.a(1, new cbt<>(this, bte.class, 10, true, false, $$0 -> $$0 instanceof cjj));
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 4.0).a(buk.v, 0.2F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B) {
         if (this.dR().t(this.dr()).a(avv.ae)) {
            this.a(this.dS().d(), 1.0F);
         }

         if (!this.dR().ab().b(dcc.c)) {
            return;
         }

         dsl $$0 = dfk.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayg.a(this.dw() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayg.a(this.dy());
            int $$4 = ayg.a(this.dC() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ja $$5 = new ja($$2, $$3, $$4);
            if (this.dR().a_($$5).i() && $$0.a((dcj)this.dR(), $$5)) {
               this.dR().b($$5, $$0);
               this.dR().a(dxh.i, $$5, dxh.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btc $$0, float $$1) {
      cni $$2 = new cni(this.dR(), this);
      double $$3 = $$0.dA() - 1.1F;
      double $$4 = $$0.dw() - this.dw();
      double $$5 = $$3 - $$2.dy();
      double $$6 = $$0.dC() - this.dC();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avh.yG, 1.0F, 0.4F / (this.dU().i() * 0.4F + 0.8F));
      this.dR().b($$2);
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxh.M, $$0);
         if (!this.dR().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqh.a(this.dR().B);
      } else {
         return bqh.e;
      }
   }

   @Override
   public void a(avi $$0) {
      this.dR().a(null, this, avh.yH, $$0, 1.0F, 1.0F);
      if (!this.dR().x_()) {
         this.w(false);
         this.a(new cud(cug.fl), this.cN());
      }
   }

   @Override
   public boolean a() {
      return this.bF() && this.t();
   }

   public boolean t() {
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
   protected avg v() {
      return avh.yD;
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.yF;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.yE;
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.75F * this.cN()), (double)(this.dl() * 0.4F));
   }
}
