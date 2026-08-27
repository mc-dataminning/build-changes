import javax.annotation.Nullable;

public class bxp extends bwp implements blx, cbm {
   private static final afo<Byte> b = afr.a(bxp.class, afq.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bxp(bku<? extends bxp> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bta(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bto(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bsj(this, cdu.class, 6.0F));
      this.bO.a(4, new bsw(this));
      this.bP.a(1, new btu<>(this, bli.class, 10, true, false, $$0 -> $$0 instanceof cba));
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 4.0).a(bmm.m, 0.2F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B) {
         if (this.dN().s(this.dn()).a(arf.ad)) {
            this.a(this.dO().c(), 1.0F);
         }

         if (!this.dN().Y().b(crw.c)) {
            return;
         }

         dhi $$0 = cvc.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = atm.a(this.ds() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = atm.a(this.du());
            int $$4 = atm.a(this.dy() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ht $$5 = new ht($$2, $$3, $$4);
            if (this.dN().a_($$5).i() && $$0.a((csd)this.dN(), $$5)) {
               this.dN().b($$5, $$0);
               this.dN().a(dls.i, $$5, dls.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(blg $$0, float $$1) {
      ceq $$2 = new ceq(this.dN(), this);
      double $$3 = $$0.dw() - 1.1F;
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$3 - $$2.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aqr.xo, 1.0F, 0.4F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 1.7F;
   }

   @Override
   protected bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.rS) && this.a()) {
         this.a(aqs.h);
         this.a(dls.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bix.a(this.dN().B);
      } else {
         return bix.d;
      }
   }

   @Override
   public void a(aqs $$0) {
      this.dN().a(null, this, aqr.xp, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         this.w(false);
         this.a(new clj(clm.fk), 1.7F);
      }
   }

   @Override
   public boolean a() {
      return this.bx() && this.w();
   }

   public boolean w() {
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
   protected aqq y() {
      return aqr.xl;
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.xn;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.xm;
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.75F * this.cI()), (double)(this.dh() * 0.4F));
   }
}
