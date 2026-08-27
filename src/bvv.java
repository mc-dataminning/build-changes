import javax.annotation.Nullable;

public class bvv extends buv implements bkd, bzs {
   private static final aef<Byte> b = aei.a(bvv.class, aeh.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvv(bja<? extends bvv> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brg(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bru(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bqp(this, cca.class, 6.0F));
      this.bO.a(4, new brc(this));
      this.bP.a(1, new bsa<>(this, bjo.class, 10, true, false, $$0 -> $$0 instanceof bzg));
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 4.0).a(bks.m, 0.2F);
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
   public boolean fg() {
      return true;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         if (this.dL().s(this.dl()).a(apu.ad)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().X().b(cpx.c)) {
            return;
         }

         dfd $$0 = cte.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = asb.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = asb.a(this.ds());
            int $$4 = asb.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gw $$5 = new gw($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((cqe)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(djn.i, $$5, djn.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bjm $$0, float $$1) {
      ccw $$2 = new ccw(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(apg.wT, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 1.7F;
   }

   @Override
   protected bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.rg) && this.a()) {
         this.a(aph.h);
         this.a(djn.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bhe.a(this.dL().B);
      } else {
         return bhe.d;
      }
   }

   @Override
   public void a(aph $$0) {
      this.dL().a(null, this, apg.wU, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         this.w(false);
         this.a(new cjl(cjo.eP), 1.7F);
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
   protected apf w() {
      return apg.wQ;
   }

   @Nullable
   @Override
   protected apf d(bhu $$0) {
      return apg.wS;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.wR;
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
