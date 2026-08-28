import javax.annotation.Nullable;

public class cff extends cfa {
   private static final bss cg = bsv.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public cff(bsv<? extends cff> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cbb(this, 1.4));
      this.bS.a(2, new bzu(this, 1.0));
      this.bS.a(3, new cbq(this, 1.0, $$0 -> $$0.a(awu.ak), false));
      this.bS.a(4, new cah(this, 1.1));
      this.bS.a(5, new cbv(this, 1.0));
      this.bS.a(6, new caq(this, cms.class, 6.0F));
      this.bS.a(7, new cbd(this));
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 4.0).a(bus.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayu.a(this.bZ, 0.0F, 1.0F);
      if (!this.aE() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      evm $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dP().B && this.bD() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(avw.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cun.qR);
         this.a(dwq.t);
         this.ce = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aV() {
      return this.ab > this.ch;
   }

   @Override
   protected void aU() {
      this.ch = this.ab + this.bZ / 2.0F;
   }

   @Override
   protected avv v() {
      return avw.eR;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.eU;
   }

   @Override
   protected avv o_() {
      return avw.eS;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cff b(arb $$0, bsj $$1) {
      return bsv.t.a((dbt)$$0);
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ak);
   }

   @Override
   public int ej() {
      return this.u() ? 10 : super.ej();
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bsp $$0, bsp.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btk) {
         ((btk)$$0).aY = this.aY;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
