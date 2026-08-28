import javax.annotation.Nullable;

public class cjy extends cir implements bxu, coh {
   private static final akj<Byte> a = akn.a(cjy.class, akl.a);
   private static final byte b = 16;

   public cjy(bwo<? extends cjy> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cez(this, 1.25, 20, 10.0F));
      this.bD.a(2, new cfn(this, 1.0, 1.0000001E-5F));
      this.bD.a(3, new cei(this, crc.class, 6.0F));
      this.bD.a(4, new cev(this));
      this.bE.a(1, new cft<>(this, bxg.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cnv));
   }

   public static byj.a j() {
      return bxg.E().a(byk.s, 4.0).a(byk.v, 0.2F);
   }

   @Override
   protected void a(akn.a $$0) {
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
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof arq $$0) {
         if (this.dV().u(this.dv()).a(axb.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(diw.d)) {
            return;
         }

         eah $$1 = dmh.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azm.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azm.a(this.dC());
            int $$5 = azm.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iu $$6 = new iu($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((djd)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(efh.i, $$6, efh.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bxe $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arq $$6) {
         czd $$7 = new czd(czh.rs);
         crx.a(new csc($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awn.zK, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.td) && this.a()) {
         if (this.dV() instanceof arq $$3) {
            this.a($$3, awo.h, $$2);
            this.a(efh.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   public void a(arq $$0, awo $$1, czd $$2) {
      $$0.a(null, this, awn.zL, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, ezd.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
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
   protected awm u() {
      return awn.zH;
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.zJ;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.zI;
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
