import javax.annotation.Nullable;

public class chu extends cgt implements bvw, cma {
   private static final ajx<Byte> a = akb.a(chu.class, ajz.a);
   private static final byte b = 16;

   public chu(buq<? extends chu> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cdc(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdq(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccl(this, cov.class, 6.0F));
      this.bS.a(4, new ccy(this));
      this.bT.a(1, new cdw<>(this, bvh.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clo));
   }

   public static bwm.a m() {
      return bvh.C().a(bwn.s, 4.0).a(bwn.v, 0.2F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.p());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW() instanceof arc $$0) {
         if (this.dW().t(this.dw()).a(awn.ae)) {
            this.a($$0, this.dX().d(), 1.0F);
         }

         if (!$$0.O().b(dgc.c)) {
            return;
         }

         dwv $$1 = djm.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayy.a(this.dB() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayy.a(this.dD());
            int $$5 = ayy.a(this.dH() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dW().a_($$6).l() && $$1.a((dgj)this.dW(), $$6)) {
               this.dW().b($$6, $$1);
               this.dW().a(ebr.i, $$6, ebr.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvf $$0, float $$1) {
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.dF() - 1.1F;
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof arc $$6) {
         cwn $$7 = new cwn(cwr.rj);
         cpo.a(new cpt($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dD(), $$4, 1.6F, 12.0F));
      }

      this.a(avz.zu, 1.0F, 0.4F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.sS) && this.a()) {
         if (this.dW() instanceof arc $$3) {
            this.a($$3, awa.h, $$2);
            this.a(ebr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   public void a(arc $$0, awa $$1, cwn $$2) {
      $$0.a(null, this, avz.zv, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, evl.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bL() && this.p();
   }

   public boolean p() {
      return (this.al.a(a) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avy u() {
      return avz.zr;
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return avz.zt;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.zs;
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.75F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
