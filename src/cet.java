import javax.annotation.Nullable;

public class cet extends ceo {
   private static final bsg ci = bsj.t.n().a(0.5F).b(0.2975F);
   public float ca;
   public float cb;
   public float cd;
   public float ce;
   public float cf = 1.0F;
   private float cj = 1.0F;
   public int cg = this.ah.a(6000) + 6000;
   public boolean ch;

   public cet(bsj<? extends cet> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cap(this, 1.4));
      this.bU.a(2, new bzi(this, 1.0));
      this.bU.a(3, new cbe(this, 1.0, $$0 -> $$0.a(awd.ak), false));
      this.bU.a(4, new bzv(this, 1.1));
      this.bU.a(5, new cbj(this, 1.0));
      this.bU.a(6, new cae(this, cmh.class, 6.0F));
      this.bU.a(7, new car(this));
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 4.0).a(bug.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.ce = this.ca;
      this.cd = this.cb;
      this.cb = this.cb + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.cb = aye.a(this.cb, 0.0F, 1.0F);
      if (!this.aE() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      evz $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cf * 2.0F;
      if (!this.dP().B && this.bD() && !this.p_() && !this.u() && --this.cg <= 0) {
         this.a(avf.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cud.qR);
         this.a(dxa.t);
         this.cg = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.cj = this.ab + this.cb / 2.0F;
   }

   @Override
   protected ave v() {
      return avf.eR;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.eU;
   }

   @Override
   protected ave o_() {
      return avf.eS;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cet b(aqk $$0, brx $$1) {
      return bsj.t.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ak);
   }

   @Override
   protected int eg() {
      return this.u() ? 10 : super.eg();
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ch = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cg = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ch);
      $$0.a("EggLayTime", this.cg);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bsd $$0, bsd.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bsy) {
         ((bsy)$$0).aY = this.aY;
      }
   }

   public boolean u() {
      return this.ch;
   }

   public void w(boolean $$0) {
      this.ch = $$0;
   }
}
