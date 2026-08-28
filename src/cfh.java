import javax.annotation.Nullable;

public class cfh extends cfc {
   private static final bst ci = bsw.t.n().a(0.5F).b(0.2975F);
   public float ca;
   public float cb;
   public float cc;
   public float ce;
   public float cf = 1.0F;
   private float cj = 1.0F;
   public int cg = this.ah.a(6000) + 6000;
   public boolean ch;

   public cfh(bsw<? extends cfh> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cbd(this, 1.4));
      this.bU.a(2, new bzw(this, 1.0));
      this.bU.a(3, new cbs(this, 1.0, $$0 -> $$0.a(awm.ak), false));
      this.bU.a(4, new caj(this, 1.1));
      this.bU.a(5, new cbx(this, 1.0));
      this.bU.a(6, new cas(this, cmv.class, 6.0F));
      this.bU.a(7, new cbf(this));
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 4.0).a(buu.v, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.ce = this.ca;
      this.cc = this.cb;
      this.cb = this.cb + (this.aF() ? -1.0F : 4.0F) * 0.3F;
      this.cb = ayn.a(this.cb, 0.0F, 1.0F);
      if (!this.aF() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      eww $$0 = this.dt();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cf * 2.0F;
      if (!this.dQ().B && this.bE() && !this.o_() && !this.t() && --this.cg <= 0) {
         this.a(avo.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cur.qR);
         this.a(dxw.t);
         this.cg = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aW() {
      return this.ab > this.cj;
   }

   @Override
   protected void aV() {
      this.cj = this.ab + this.cb / 2.0F;
   }

   @Override
   protected avn v() {
      return avo.eR;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.eU;
   }

   @Override
   protected avn n_() {
      return avo.eS;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cfh b(aqt $$0, bsk $$1) {
      return bsw.t.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ak);
   }

   @Override
   protected int eh() {
      return this.t() ? 10 : super.eh();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ch = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cg = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ch);
      $$0.a("EggLayTime", this.cg);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bsq $$0, bsq.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btl) {
         ((btl)$$0).aY = this.aY;
      }
   }

   public boolean t() {
      return this.ch;
   }

   public void w(boolean $$0) {
      this.ch = $$0;
   }
}
