import javax.annotation.Nullable;

public class cfj extends cfe {
   private static final bsu ci = bsx.t.n().a(0.5F).b(0.2975F);
   public float ca;
   public float cb;
   public float cc;
   public float ce;
   public float cf = 1.0F;
   private float cj = 1.0F;
   public int cg = this.ah.a(6000) + 6000;
   public boolean ch;

   public cfj(bsx<? extends cfj> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cbf(this, 1.4));
      this.bU.a(2, new bzy(this, 1.0));
      this.bU.a(3, new cbu(this, 1.0, $$0 -> $$0.a(awn.ak), false));
      this.bU.a(4, new cal(this, 1.1));
      this.bU.a(5, new cbz(this, 1.0));
      this.bU.a(6, new cau(this, cmx.class, 6.0F));
      this.bU.a(7, new cbh(this));
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 4.0).a(buw.v, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.ce = this.ca;
      this.cc = this.cb;
      this.cb = this.cb + (this.aF() ? -1.0F : 4.0F) * 0.3F;
      this.cb = ayo.a(this.cb, 0.0F, 1.0F);
      if (!this.aF() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      exc $$0 = this.dr();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cf * 2.0F;
      if (!this.dO().B && this.bE() && !this.o_() && !this.t() && --this.cg <= 0) {
         this.a(avp.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cut.qR);
         this.a(dxz.t);
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
   protected avo v() {
      return avp.eR;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.eU;
   }

   @Override
   protected avo n_() {
      return avp.eS;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cfj b(aqu $$0, bsl $$1) {
      return bsx.t.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ak);
   }

   @Override
   protected int eg() {
      return this.t() ? 10 : super.eg();
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ch = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cg = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ch);
      $$0.a("EggLayTime", this.cg);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bsr $$0, bsr.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btn) {
         ((btn)$$0).aY = this.aY;
      }
   }

   public boolean t() {
      return this.ch;
   }

   public void x(boolean $$0) {
      this.ch = $$0;
   }
}
