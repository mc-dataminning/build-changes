import javax.annotation.Nullable;

public class ckp extends cjj implements bym, cpf {
   private static final akn<Byte> a = akr.a(ckp.class, akp.a);
   private static final byte b = 16;
   private static final boolean c = true;

   public ckp(bxe<? extends ckp> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfr(this, 1.25, 20, 10.0F));
      this.bF.a(2, new cgf(this, 1.0, 1.0000001E-5F));
      this.bF.a(3, new cfa(this, crz.class, 6.0F));
      this.bF.a(4, new cfn(this));
      this.bG.a(1, new cgl<>(this, bxy.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cot));
   }

   public static bzb.a j() {
      return bxy.E().a(bzc.s, 4.0).a(bzc.v, 0.2F);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(ua $$0) {
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
      if (this.dV() instanceof aru $$0) {
         if (this.dV().u(this.dv()).a(axf.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(djv.d)) {
            return;
         }

         ebg $$1 = dng.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azq.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azq.a(this.dC());
            int $$5 = azq.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iw $$6 = new iw($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dkc)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(egg.i, $$6, egg.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bxw $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof aru $$6) {
         daa $$7 = new daa(dae.rs);
         csu.a(new csz($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awr.zK, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.td) && this.a()) {
         if (this.dV() instanceof aru $$3) {
            this.a($$3, aws.h, $$2);
            this.a(egg.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   public void a(aru $$0, aws $$1, daa $$2) {
      $$0.a(null, this, awr.zL, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, faf.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
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
   protected awq u() {
      return awr.zH;
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.zJ;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.zI;
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
