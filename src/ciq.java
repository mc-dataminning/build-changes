import javax.annotation.Nullable;

public class ciq extends chp implements bws, cmw {
   private static final alc<Byte> a = alg.a(ciq.class, ale.a);
   private static final byte b = 16;

   public ciq(bvm<? extends ciq> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdy(this, 1.25, 20, 10.0F));
      this.bT.a(2, new cem(this, 1.0, 1.0000001E-5F));
      this.bT.a(3, new cdh(this, cps.class, 6.0F));
      this.bT.a(4, new cdu(this));
      this.bU.a(1, new ces<>(this, bwd.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cmk));
   }

   public static bxi.a m() {
      return bwd.C().a(bxj.s, 4.0).a(bxj.v, 0.2F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.p());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV() instanceof ash $$0) {
         if (this.dV().t(this.dv()).a(axt.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.N().b(dgw.c)) {
            return;
         }

         dxn $$1 = dkg.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = bae.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = bae.a(this.dC());
            int $$5 = bae.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            jh $$6 = new jh($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dhd)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ecj.i, $$6, ecj.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bwb $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ash $$6) {
         cxk $$7 = new cxk(cxo.ra);
         cql.a(new cqq($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(axf.ze, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.sJ) && this.a()) {
         if (this.dV() instanceof ash $$3) {
            this.a($$3, axg.h, $$2);
            this.a(ecj.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxk $$2) {
      $$0.a(null, this, axf.zf, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, ewd.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bL() && this.p();
   }

   public boolean p() {
      return (this.al.a(a) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.zb;
   }

   @Nullable
   @Override
   protected axe e(btv $$0) {
      return axf.zd;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.zc;
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
