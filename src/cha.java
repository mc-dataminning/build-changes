import javax.annotation.Nullable;

public class cha extends cgv {
   private static final bul cg = bup.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.af.a(6000) + 6000;
   public boolean cf;

   public cha(bup<? extends cha> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new ccv(this, 1.4));
      this.bS.a(2, new cbo(this, 1.0));
      this.bS.a(3, new cdk(this, 1.0, $$0 -> $$0.a(axm.ao), false));
      this.bS.a(4, new ccb(this, 1.1));
      this.bS.a(5, new cdp(this, 1.0));
      this.bS.a(6, new cck(this, cor.class, 6.0F));
      this.bS.a(7, new ccx(this));
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 4.0).a(bwm.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aL() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azn.a(this.bZ, 0.0F, 1.0F);
      if (!this.aL() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      ezr $$0 = this.dB();
      if (!this.aL() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dY().C && this.bN() && !this.p_() && !this.t() && --this.ce <= 0) {
         if (this.a(euc.aI, this::b)) {
            this.a(awo.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(eak.t);
         }

         this.ce = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean bc() {
      return this.Z > this.ch;
   }

   @Override
   protected void bb() {
      this.ch = this.Z + this.bZ / 2.0F;
   }

   @Override
   protected awn w() {
      return awo.eS;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.eV;
   }

   @Override
   protected awn o_() {
      return awo.eT;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cha b(arq $$0, btz $$1) {
      return bup.t.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ao);
   }

   @Override
   protected int er() {
      return this.t() ? 10 : super.er();
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bui $$0, bui.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bve) {
         ((bve)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
