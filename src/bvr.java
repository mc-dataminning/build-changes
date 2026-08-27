import javax.annotation.Nullable;

public class bvr extends bur implements bjz, bzo {
   private static final aeg<Byte> b = aej.a(bvr.class, aei.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvr(biw<? extends bvr> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brc(this, 1.25, 20, 10.0F));
      this.bO.a(2, new brq(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bql(this, cbw.class, 6.0F));
      this.bO.a(4, new bqy(this));
      this.bP.a(1, new brw<>(this, bjk.class, 10, true, false, $$0 -> $$0 instanceof bzc));
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 4.0).a(bko.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean ff() {
      return true;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         if (this.dL().s(this.dl()).a(apt.ad)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().X().b(cpt.c)) {
            return;
         }

         dfl $$0 = csy.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ary.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ary.a(this.ds());
            int $$4 = ary.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gw $$5 = new gw($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((cqa)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(djv.i, $$5, djv.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bji $$0, float $$1) {
      ccs $$2 = new ccs(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(apf.wT, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 1.7F;
   }

   @Override
   protected bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(cjk.rg) && this.a()) {
         this.a(apg.h);
         this.a(djv.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bha.a(this.dL().B);
      } else {
         return bha.d;
      }
   }

   @Override
   public void a(apg $$0) {
      this.dL().a(null, this, apf.wU, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         this.w(false);
         this.a(new cjh(cjk.eP), 1.7F);
      }
   }

   @Override
   public boolean a() {
      return this.bv() && this.t();
   }

   public boolean t() {
      return (this.an.b(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(b);
      if ($$0) {
         this.an.b(b, (byte)($$1 | 16));
      } else {
         this.an.b(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected ape w() {
      return apf.wQ;
   }

   @Nullable
   @Override
   protected ape d(bhq $$0) {
      return apf.wS;
   }

   @Nullable
   @Override
   protected ape l_() {
      return apf.wR;
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
