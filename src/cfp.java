import javax.annotation.Nullable;

public class cfp extends cep implements bts, cju {
   private static final ajp<Byte> b = ajt.a(cfp.class, ajr.a);
   private static final byte c = 16;

   public cfp(bsm<? extends cfp> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cay(this, 1.25, 20, 10.0F));
      this.bU.a(2, new cbm(this, 1.0, 1.0000001E-5F));
      this.bU.a(3, new cah(this, cmk.class, 6.0F));
      this.bU.a(4, new cau(this));
      this.bV.a(1, new cbs<>(this, btd.class, 10, true, false, $$0 -> $$0 instanceof cji));
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 4.0).a(buj.v, 0.2F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(tx $$0) {
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
   public void n_() {
      super.n_();
      if (!this.dQ().B) {
         if (this.dQ().t(this.dq()).a(avv.ae)) {
            this.a(this.dR().d(), 1.0F);
         }

         if (!this.dQ().ab().b(dcb.c)) {
            return;
         }

         dsk $$0 = dfj.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayg.a(this.dv() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayg.a(this.dx());
            int $$4 = ayg.a(this.dB() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ja $$5 = new ja($$2, $$3, $$4);
            if (this.dQ().a_($$5).i() && $$0.a((dci)this.dQ(), $$5)) {
               this.dQ().b($$5, $$0);
               this.dQ().a(dxg.i, $$5, dxg.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btb $$0, float $$1) {
      cnh $$2 = new cnh(this.dQ(), this);
      double $$3 = $$0.dz() - 1.1F;
      double $$4 = $$0.dv() - this.dv();
      double $$5 = $$3 - $$2.dx();
      double $$6 = $$0.dB() - this.dB();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avh.yG, 1.0F, 0.4F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$2);
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxg.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqg.a(this.dQ().B);
      } else {
         return bqg.e;
      }
   }

   @Override
   public void a(avi $$0) {
      this.dQ().a(null, this, avh.yH, $$0, 1.0F, 1.0F);
      if (!this.dQ().x_()) {
         this.w(false);
         this.a(new cuc(cuf.fl), this.cM());
      }
   }

   @Override
   public boolean a() {
      return this.bE() && this.u();
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
   protected avg v() {
      return avh.yD;
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return avh.yF;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.yE;
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.75F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
