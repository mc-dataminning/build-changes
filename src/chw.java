import javax.annotation.Nullable;

public class chw extends cgv implements bvy, cmc {
   private static final akm<Byte> a = akq.a(chw.class, ako.a);
   private static final byte b = 16;

   public chw(bus<? extends chw> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cde(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cds(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccn(this, cou.class, 6.0F));
      this.bS.a(4, new cda(this));
      this.bT.a(1, new cdy<>(this, bvj.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clq));
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 4.0).a(bwp.v, 0.2F);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.q());
   }

   @Override
   public void a(ul $$0) {
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
      if (this.dV() instanceof arp $$0) {
         if (this.dV().t(this.dv()).a(axb.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.N().b(dfi.c)) {
            return;
         }

         dvv $$1 = dis.dN.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azm.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azm.a(this.dC());
            int $$5 = azm.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            jh $$6 = new jh($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dfp)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ear.i, $$6, ear.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvh $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arp $$6) {
         cwm $$7 = new cwm(cwq.qD);
         cpn.a(new cps($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awn.yK, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.sm) && this.a()) {
         if (this.dV() instanceof arp $$3) {
            this.a($$3, awo.h, $$2);
            this.a(ear.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   public void a(arp $$0, awo $$1, cwm $$2) {
      $$0.a(null, this, awn.yL, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, euj.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bL() && this.q();
   }

   public boolean q() {
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
   protected awm t() {
      return awn.yH;
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return awn.yJ;
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.yI;
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
