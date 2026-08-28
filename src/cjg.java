import javax.annotation.Nullable;

public class cjg extends cid implements bxh, cnn {
   private static final akg<Byte> a = akk.a(cjg.class, aki.a);
   private static final byte b = 16;

   public cjg(bwb<? extends cjg> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cem(this, 1.25, 20, 10.0F));
      this.bB.a(2, new cfa(this, 1.0, 1.0000001E-5F));
      this.bB.a(3, new cdv(this, cqi.class, 6.0F));
      this.bB.a(4, new cei(this));
      this.bC.a(1, new cfg<>(this, bwt.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cnb));
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 4.0).a(bxx.v, 0.2F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof arn $$0) {
         if (this.dV().t(this.dv()).a(awy.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(dhl.c)) {
            return;
         }

         dym $$1 = dkw.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azk.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azk.a(this.dC());
            int $$5 = azk.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            jj $$6 = new jj($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dhs)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(edm.i, $$6, edm.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bwr $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arn $$6) {
         cxy $$7 = new cxy(cyc.rn);
         crb.a(new crg($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awk.zE, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.sW) && this.a()) {
         if (this.dV() instanceof arn $$3) {
            this.a($$3, awl.h, $$2);
            this.a(edm.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   public void a(arn $$0, awl $$1, cxy $$2) {
      $$0.a(null, this, awk.zF, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, exh.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bK() && this.m();
   }

   public boolean m() {
      return (this.al.a(a) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awj u() {
      return awk.zB;
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.zD;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.zC;
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
