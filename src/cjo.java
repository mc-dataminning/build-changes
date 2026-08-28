import javax.annotation.Nullable;

public class cjo extends cil implements bxp, cnx {
   private static final akh<Byte> a = akl.a(cjo.class, akj.a);
   private static final byte b = 16;

   public cjo(bwj<? extends cjo> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ceu(this, 1.25, 20, 10.0F));
      this.bC.a(2, new cfi(this, 1.0, 1.0000001E-5F));
      this.bC.a(3, new ced(this, cqs.class, 6.0F));
      this.bC.a(4, new ceq(this));
      this.bD.a(1, new cfo<>(this, bxb.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cnl));
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 4.0).a(byf.v, 0.2F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof aro $$0) {
         if (this.dV().u(this.dv()).a(awz.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(dil.c)) {
            return;
         }

         dzo $$1 = dlw.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azk.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azk.a(this.dC());
            int $$5 = azk.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iu $$6 = new iu($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dis)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(eeo.i, $$6, eeo.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bwz $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof aro $$6) {
         cys $$7 = new cys(cyw.rn);
         crm.a(new crr($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awl.zE, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.sW) && this.a()) {
         if (this.dV() instanceof aro $$3) {
            this.a($$3, awm.h, $$2);
            this.a(eeo.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   public void a(aro $$0, awm $$1, cys $$2) {
      $$0.a(null, this, awl.zF, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, eyj.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bK() && this.m();
   }

   public boolean m() {
      return (this.al.a(a) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awk u() {
      return awl.zB;
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.zD;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.zC;
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
