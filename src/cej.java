import javax.annotation.Nullable;

public class cej extends cee {
   private static final bry cp = bsb.v.n().a(0.5F).b(0.2975F);
   public float ch;
   public float ci;
   public float ck;
   public float cl;
   public float cm = 1.0F;
   private float cq = 1.0F;
   public int cn = this.al.a(6000) + 6000;
   public boolean co;

   public cej(bsb<? extends cej> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cae(this, 1.4));
      this.cb.a(2, new byx(this, 1.0));
      this.cb.a(3, new cat(this, 1.0, $$0 -> $$0.a(awm.ak), false));
      this.cb.a(4, new bzk(this, 1.1));
      this.cb.a(5, new cay(this, 1.0));
      this.cb.a(6, new bzt(this, cly.class, 6.0F));
      this.cb.a(7, new cag(this));
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cp : super.e($$0);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 4.0).a(btv.r, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.cl = this.ch;
      this.ck = this.ci;
      this.ci = this.ci + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.ci = aym.a(this.ci, 0.0F, 1.0F);
      if (!this.aE() && this.cm < 1.0F) {
         this.cm = 1.0F;
      }

      this.cm *= 0.9F;
      ewu $$0 = this.dx();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ch = this.ch + this.cm * 2.0F;
      if (!this.dU().C && this.bI() && !this.o_() && !this.t() && --this.cn <= 0) {
         this.a(avo.eY, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
         this.a(cuk.so);
         this.a(dxv.t);
         this.cn = this.al.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aZ() {
      return this.ac > this.cq;
   }

   @Override
   protected void aY() {
      this.cq = this.ac + this.ci / 2.0F;
   }

   @Override
   protected avn u() {
      return avo.eW;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.eZ;
   }

   @Override
   protected avn n_() {
      return avo.eX;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.fa, 0.15F, 1.0F);
   }

   @Nullable
   public cej b(aqt $$0, brp $$1) {
      return bsb.v.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ak);
   }

   @Override
   public int er() {
      return this.t() ? 10 : super.er();
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.co = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cn = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.co);
      $$0.a("EggLayTime", this.cn);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(brv $$0, brv.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bso) {
         ((bso)$$0).bj = this.bj;
      }
   }

   public boolean t() {
      return this.co;
   }

   public void w(boolean $$0) {
      this.co = $$0;
   }
}
