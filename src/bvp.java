import javax.annotation.Nullable;

public class bvp extends bup implements bjx, bzm {
   private static final aee<Byte> b = aeh.a(bvp.class, aeg.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvp(biu<? extends bvp> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bra(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bro(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bqj(this, cbu.class, 6.0F));
      this.bO.a(4, new bqw(this));
      this.bP.a(1, new bru<>(this, bji.class, 10, true, false, $$0 -> $$0 instanceof bza));
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 4.0).a(bkm.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(qw $$0) {
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
         if (this.dL().s(this.dl()).a(apr.ad)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().X().b(cpr.c)) {
            return;
         }

         dfj $$0 = csw.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = arw.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = arw.a(this.ds());
            int $$4 = arw.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gw $$5 = new gw($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((cpy)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(djt.i, $$5, djt.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bjg $$0, float $$1) {
      ccq $$2 = new ccq(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(apd.wT, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 1.7F;
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.rg) && this.a()) {
         this.a(ape.h);
         this.a(djt.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgy.a(this.dL().B);
      } else {
         return bgy.d;
      }
   }

   @Override
   public void a(ape $$0) {
      this.dL().a(null, this, apd.wU, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         this.w(false);
         this.a(new cjf(cji.eP), 1.7F);
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
   protected apc w() {
      return apd.wQ;
   }

   @Nullable
   @Override
   protected apc d(bho $$0) {
      return apd.wS;
   }

   @Nullable
   @Override
   protected apc l_() {
      return apd.wR;
   }

   @Override
   public ehn cI() {
      return new ehn(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
