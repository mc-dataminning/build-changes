import javax.annotation.Nullable;

public class cej extends cee {
   private static final brx cg = bsa.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public cej(bsa<? extends cej> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new caf(this, 1.4));
      this.bS.a(2, new byy(this, 1.0));
      this.bS.a(3, new cau(this, 1.0, $$0 -> $$0.a(awe.ak), false));
      this.bS.a(4, new bzl(this, 1.1));
      this.bS.a(5, new caz(this, 1.0));
      this.bS.a(6, new bzu(this, clw.class, 6.0F));
      this.bS.a(7, new cah(this));
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 4.0).a(btw.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayd.a(this.bZ, 0.0F, 1.0F);
      if (!this.aE() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      euk $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dP().B && this.bD() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(avh.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctr.qR);
         this.a(dvu.t);
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
   protected avg v() {
      return avh.eR;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.eU;
   }

   @Override
   protected avg o_() {
      return avh.eS;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cej b(aqm $$0, bro $$1) {
      return bsa.t.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ak);
   }

   @Override
   public int ej() {
      return this.u() ? 10 : super.ej();
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bru $$0, bru.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bso) {
         ((bso)$$0).aZ = this.aZ;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
