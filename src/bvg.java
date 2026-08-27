import javax.annotation.Nullable;

public class bvg extends bug implements bjo, bzd {
   private static final adx<Byte> b = aea.a(bvg.class, adz.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvg(bik<? extends bvg> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqr(this, 1.25, 20, 10.0F));
      this.bO.a(2, new brf(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bqa(this, cbl.class, 6.0F));
      this.bO.a(4, new bqn(this));
      this.bP.a(1, new brl<>(this, biy.class, 10, true, false, $$0 -> $$0 instanceof byr));
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 4.0).a(bkd.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.q());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         if (this.dK().s(this.dk()).a(api.ad)) {
            this.a(this.dL().c(), 1.0F);
         }

         if (!this.dK().X().b(cpg.c)) {
            return;
         }

         dey $$0 = csl.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aro.a(this.dp() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aro.a(this.dr());
            int $$4 = aro.a(this.dv() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gv $$5 = new gv($$2, $$3, $$4);
            if (this.dK().a_($$5).i() && $$0.a((cpn)this.dK(), $$5)) {
               this.dK().b($$5, $$0);
               this.dK().a(dji.i, $$5, dji.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(biw $$0, float $$1) {
      cch $$2 = new cch(this.dK(), this);
      double $$3 = $$0.dt() - 1.1F;
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$3 - $$2.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aou.wT, 1.0F, 0.4F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 1.7F;
   }

   @Override
   protected bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.rg) && this.a()) {
         this.a(aov.h);
         this.a(dji.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgo.a(this.dK().B);
      } else {
         return bgo.d;
      }
   }

   @Override
   public void a(aov $$0) {
      this.dK().a(null, this, aou.wU, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         this.w(false);
         this.a(new ciw(ciz.eP), 1.7F);
      }
   }

   @Override
   public boolean a() {
      return this.bv() && this.q();
   }

   public boolean q() {
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
   protected aot r() {
      return aou.wQ;
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.wS;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.wR;
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
