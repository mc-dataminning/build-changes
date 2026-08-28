import javax.annotation.Nullable;

public class cga extends cfa implements bud, ckf {
   private static final ajv<Byte> b = ajz.a(cga.class, ajx.a);
   private static final byte c = 16;

   public cga(bsw<? extends cga> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cbj(this, 1.25, 20, 10.0F));
      this.bU.a(2, new cbx(this, 1.0, 1.0000001E-5F));
      this.bU.a(3, new cas(this, cmv.class, 6.0F));
      this.bU.a(4, new cbf(this));
      this.bV.a(1, new ccd<>(this, btn.class, 10, true, false, $$0 -> $$0 instanceof cjt));
   }

   public static but.a s() {
      return btn.A().a(buu.s, 4.0).a(buu.v, 0.2F);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B) {
         if (this.dQ().t(this.dq()).a(awc.ae)) {
            this.a(this.dR().d(), 1.0F);
         }

         if (!this.dQ().ab().b(dcq.c)) {
            return;
         }

         dta $$0 = dfy.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayn.a(this.dv() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayn.a(this.dx());
            int $$4 = ayn.a(this.dB() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jd $$5 = new jd($$2, $$3, $$4);
            if (this.dQ().a_($$5).i() && $$0.a((dcx)this.dQ(), $$5)) {
               this.dQ().b($$5, $$0);
               this.dQ().a(dxw.i, $$5, dxw.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(btl $$0, float $$1) {
      cns $$2 = new cns(this.dQ(), this);
      double $$3 = $$0.dz() - 1.1F;
      double $$4 = $$0.dv() - this.dv();
      double $$5 = $$3 - $$2.dx();
      double $$6 = $$0.dB() - this.dB();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avo.yG, 1.0F, 0.4F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$2);
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV) && this.a()) {
         this.a(avp.h);
         this.a(dxw.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqq.a(this.dQ().B);
      } else {
         return bqq.e;
      }
   }

   @Override
   public void a(avp $$0) {
      this.dQ().a(null, this, avo.yH, $$0, 1.0F, 1.0F);
      if (!this.dQ().x_()) {
         this.w(false);
         this.a(new cuo(cur.fl), this.cM());
      }
   }

   @Override
   public boolean a() {
      return this.bE() && this.t();
   }

   public boolean t() {
      return (this.ao.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         this.ao.a(b, (byte)($$1 | 16));
      } else {
         this.ao.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avn v() {
      return avo.yD;
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.yF;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.yE;
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.75F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
