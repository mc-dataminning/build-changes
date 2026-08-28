import javax.annotation.Nullable;

public class ckn extends cjh implements byk, cpd {
   private static final akl<Byte> a = akp.a(ckn.class, akn.a);
   private static final byte b = 16;
   private static final boolean c = true;

   public ckn(bxc<? extends ckn> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfp(this, 1.25, 20, 10.0F));
      this.bF.a(2, new cgd(this, 1.0, 1.0000001E-5F));
      this.bF.a(3, new cey(this, crx.class, 6.0F));
      this.bF.a(4, new cfl(this));
      this.bG.a(1, new cgj<>(this, bxw.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cor));
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 4.0).a(bza.v, 0.2F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("Pumpkin", true));
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof ars $$0) {
         if (this.dV().u(this.dv()).a(axd.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(djt.d)) {
            return;
         }

         ebe $$1 = dne.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azo.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azo.a(this.dC());
            int $$5 = azo.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iv $$6 = new iv($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dka)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ege.i, $$6, ege.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bxu $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ars $$6) {
         czy $$7 = new czy(dac.rs);
         css.a(new csx($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awp.zK, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.td) && this.a()) {
         if (this.dV() instanceof ars $$3) {
            this.a($$3, awq.h, $$2);
            this.a(ege.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   public void a(ars $$0, awq $$1, czy $$2) {
      $$0.a(null, this, awp.zL, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, fad.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bJ() && this.m();
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
   protected awo u() {
      return awp.zH;
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return awp.zJ;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.zI;
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
