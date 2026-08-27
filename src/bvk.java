import javax.annotation.Nullable;

public class bvk extends buk implements bjs, bzh {
   private static final aec<Byte> b = aef.a(bvk.class, aee.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvk(bip<? extends bvk> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqv(this, 1.25, 20, 10.0F));
      this.bO.a(2, new brj(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bqe(this, cbp.class, 6.0F));
      this.bO.a(4, new bqr(this));
      this.bP.a(1, new brp<>(this, bjd.class, 10, true, false, $$0 -> $$0 instanceof byv));
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 4.0).a(bkh.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.q());
   }

   @Override
   public void a(qu $$0) {
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
         if (this.dK().s(this.dk()).a(apn.ad)) {
            this.a(this.dL().c(), 1.0F);
         }

         if (!this.dK().X().b(cpm.c)) {
            return;
         }

         dfe $$0 = csr.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ars.a(this.dp() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ars.a(this.dr());
            int $$4 = ars.a(this.dv() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gw $$5 = new gw($$2, $$3, $$4);
            if (this.dK().a_($$5).i() && $$0.a((cpt)this.dK(), $$5)) {
               this.dK().b($$5, $$0);
               this.dK().a(djo.i, $$5, djo.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bjb $$0, float $$1) {
      ccl $$2 = new ccl(this.dK(), this);
      double $$3 = $$0.dt() - 1.1F;
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$3 - $$2.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aoz.wT, 1.0F, 0.4F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 1.7F;
   }

   @Override
   protected bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.rg) && this.a()) {
         this.a(apa.h);
         this.a(djo.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgt.a(this.dK().B);
      } else {
         return bgt.d;
      }
   }

   @Override
   public void a(apa $$0) {
      this.dK().a(null, this, aoz.wU, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         this.w(false);
         this.a(new cja(cjd.eP), 1.7F);
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
   protected aoy r() {
      return aoz.wQ;
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.wS;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.wR;
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
