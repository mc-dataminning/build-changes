import javax.annotation.Nullable;

public class cew extends cer {
   private static final bsj ci = bsm.t.n().a(0.5F).b(0.2975F);
   public float ca;
   public float cb;
   public float cd;
   public float ce;
   public float cf = 1.0F;
   private float cj = 1.0F;
   public int cg = this.ah.a(6000) + 6000;
   public boolean ch;

   public cew(bsm<? extends cew> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cas(this, 1.4));
      this.bU.a(2, new bzl(this, 1.0));
      this.bU.a(3, new cbh(this, 1.0, $$0 -> $$0.a(awf.ak), false));
      this.bU.a(4, new bzy(this, 1.1));
      this.bU.a(5, new cbm(this, 1.0));
      this.bU.a(6, new cah(this, cmk.class, 6.0F));
      this.bU.a(7, new cau(this));
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 4.0).a(buj.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.ce = this.ca;
      this.cd = this.cb;
      this.cb = this.cb + (this.aF() ? -1.0F : 4.0F) * 0.3F;
      this.cb = ayg.a(this.cb, 0.0F, 1.0F);
      if (!this.aF() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ewf $$0 = this.dt();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cf * 2.0F;
      if (!this.dQ().B && this.bE() && !this.p_() && !this.u() && --this.cg <= 0) {
         this.a(avh.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cuf.qR);
         this.a(dxg.t);
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
   protected avg v() {
      return avh.eR;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.eU;
   }

   @Override
   protected avg o_() {
      return avh.eS;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cew b(aqm $$0, bsa $$1) {
      return bsm.t.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ak);
   }

   @Override
   protected int eh() {
      return this.u() ? 10 : super.eh();
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
   protected void a(bsg $$0, bsg.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btb) {
         ((btb)$$0).aY = this.aY;
      }
   }

   public boolean u() {
      return this.ch;
   }

   public void w(boolean $$0) {
      this.ch = $$0;
   }
}
