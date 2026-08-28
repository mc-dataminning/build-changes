import javax.annotation.Nullable;

public class cfl extends cfg {
   private static final bsy cg = btb.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public cfl(btb<? extends cfl> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cbh(this, 1.4));
      this.bS.a(2, new caa(this, 1.0));
      this.bS.a(3, new cbw(this, 1.0, $$0 -> $$0.a(awy.ak), false));
      this.bS.a(4, new can(this, 1.1));
      this.bS.a(5, new ccb(this, 1.0));
      this.bS.a(6, new caw(this, cmy.class, 6.0F));
      this.bS.a(7, new cbj(this));
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 4.0).a(buy.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayz.a(this.bZ, 0.0F, 1.0F);
      if (!this.aE() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      evs $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dP().B && this.bD() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(awa.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cut.qR);
         this.a(dww.t);
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
   protected avz v() {
      return awa.eR;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.eU;
   }

   @Override
   protected avz o_() {
      return awa.eS;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cfl b(arf $$0, bsp $$1) {
      return btb.t.a((dbz)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.ak);
   }

   @Override
   public int ej() {
      return this.u() ? 10 : super.ej();
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bsv $$0, bsv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btq) {
         ((btq)$$0).aY = this.aY;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
