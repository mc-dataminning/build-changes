import javax.annotation.Nullable;

public class cgc extends cfc implements buf, ckh {
   private static final ajw<Byte> b = aka.a(cgc.class, ajy.a);
   private static final byte c = 16;

   public cgc(bsx<? extends cgc> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bW.a(1, new cbl(this, 1.25, 20, 10.0F));
      this.bW.a(2, new cbz(this, 1.0, 1.0000001E-5F));
      this.bW.a(3, new cau(this, cmx.class, 6.0F));
      this.bW.a(4, new cbh(this));
      this.bX.a(1, new ccf<>(this, btp.class, 10, true, false, $$0 -> $$0 instanceof cjv));
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 4.0).a(buw.v, 0.2F);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B) {
         if (this.dO().t(this.do()).a(awd.ae)) {
            this.a(this.dP().d(), 1.0F);
         }

         if (!this.dO().ab().b(dcs.c)) {
            return;
         }

         dtc $$0 = dga.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayo.a(this.dt() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayo.a(this.dv());
            int $$4 = ayo.a(this.dz() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jd $$5 = new jd($$2, $$3, $$4);
            if (this.dO().a_($$5).i() && $$0.a((dcz)this.dO(), $$5)) {
               this.dO().b($$5, $$0);
               this.dO().a(dxz.i, $$5, dxz.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btn $$0, float $$1) {
      cnu $$2 = new cnu(this.dO(), this);
      double $$3 = $$0.dx() - 1.1F;
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$3 - $$2.dv();
      double $$6 = $$0.dz() - this.dz();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avp.yG, 1.0F, 0.4F / (this.dR().i() * 0.4F + 0.8F));
      this.dO().b($$2);
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.rV) && this.a()) {
         this.a(avq.h);
         this.a(dxz.M, $$0);
         if (!this.dO().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqr.a(this.dO().B);
      } else {
         return bqr.e;
      }
   }

   @Override
   public void a(avq $$0) {
      this.dO().a(null, this, avp.yH, $$0, 1.0F, 1.0F);
      if (!this.dO().x_()) {
         this.x(false);
         this.a(new cuq(cut.fl), this.cL());
      }
   }

   @Override
   public boolean a() {
      return this.bE() && this.t();
   }

   public boolean t() {
      return (this.ao.a(b) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         this.ao.a(b, (byte)($$1 | 16));
      } else {
         this.ao.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avo v() {
      return avp.yD;
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return avp.yF;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.yE;
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
