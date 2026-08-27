import javax.annotation.Nullable;

public class bws extends bvs implements bla, cap {
   private static final afc<Byte> b = aff.a(bws.class, afe.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bws(bjx<? extends bws> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bsd(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bsr(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new brm(this, ccx.class, 6.0F));
      this.bO.a(4, new brz(this));
      this.bP.a(1, new bsx<>(this, bkl.class, 10, true, false, $$0 -> $$0 instanceof cad));
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 4.0).a(blp.m, 0.2F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(rt $$0) {
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
   public void c_() {
      super.c_();
      if (!this.dL().B) {
         if (this.dL().s(this.dl()).a(aqr.ad)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().X().b(cqv.c)) {
            return;
         }

         dgb $$0 = cuc.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = asy.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = asy.a(this.ds());
            int $$4 = asy.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ht $$5 = new ht($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((crc)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(dkl.i, $$5, dkl.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bkj $$0, float $$1) {
      cdt $$2 = new cdt(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aqd.wV, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 1.7F;
   }

   @Override
   protected bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.rg) && this.a()) {
         this.a(aqe.h);
         this.a(dkl.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bib.a(this.dL().B);
      } else {
         return bib.d;
      }
   }

   @Override
   public void a(aqe $$0) {
      this.dL().a(null, this, aqd.wW, $$0, 1.0F, 1.0F);
      if (!this.dL().x_()) {
         this.w(false);
         this.a(new ckj(ckm.eP), 1.7F);
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
   protected aqc w() {
      return aqd.wS;
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.wU;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.wT;
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
