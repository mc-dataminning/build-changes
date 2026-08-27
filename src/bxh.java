import javax.annotation.Nullable;

public class bxh extends bwh implements blp, cbe {
   private static final afm<Byte> b = afp.a(bxh.class, afo.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bxh(bkm<? extends bxh> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bss(this, 1.25, 20, 10.0F));
      this.bO.a(2, new btg(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bsb(this, cdm.class, 6.0F));
      this.bO.a(4, new bso(this));
      this.bP.a(1, new btm<>(this, bla.class, 10, true, false, $$0 -> $$0 instanceof cas));
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 4.0).a(bme.m, 0.2F);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(rz $$0) {
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
         if (this.dL().s(this.dl()).a(arb.ad)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().X().b(cro.c)) {
            return;
         }

         dgw $$0 = cuv.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ati.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ati.a(this.ds());
            int $$4 = ati.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ht $$5 = new ht($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((crv)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(dlg.i, $$5, dlg.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bky $$0, float $$1) {
      cei $$2 = new cei(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aqn.wX, 1.0F, 0.4F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 1.7F;
   }

   @Override
   protected biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.rh) && this.a()) {
         this.a(aqo.h);
         this.a(dlg.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return biq.a(this.dL().B);
      } else {
         return biq.d;
      }
   }

   @Override
   public void a(aqo $$0) {
      this.dL().a(null, this, aqn.wY, $$0, 1.0F, 1.0F);
      if (!this.dL().x_()) {
         this.w(false);
         this.a(new clb(cle.eP), 1.7F);
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
   protected aqm w() {
      return aqn.wU;
   }

   @Nullable
   @Override
   protected aqm d(bjg $$0) {
      return aqn.wW;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.wV;
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
