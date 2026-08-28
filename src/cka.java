public class cka extends ckk {
   public cka(bsw<? extends cka> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static but.a s() {
      return ckb.gs().a(buu.v, 0.2F);
   }

   public static boolean b(bsw<cka> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.al() != bqn.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buu.a).a((double)($$0 * 3));
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   protected lk t() {
      return lm.F;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected int x() {
      return super.x() * 4;
   }

   @Override
   protected void gi() {
      this.e *= 0.9F;
   }

   @Override
   protected void fg() {
      eww $$0 = this.dt();
      float $$1 = (float)this.gn() * 0.1F;
      this.n($$0.c, (double)(this.fe() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awt<eox> $$0) {
      if ($$0 == awj.b) {
         eww $$1 = this.dt();
         this.n($$1.c, (double)(0.22F + (float)this.gn() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gj() {
      return this.dc();
   }

   @Override
   protected float gk() {
      return super.gk() + 2.0F;
   }

   @Override
   protected avn d(brj $$0) {
      return this.go() ? avo.ot : avo.os;
   }

   @Override
   protected avn n_() {
      return this.go() ? avo.oh : avo.or;
   }

   @Override
   protected avn gl() {
      return this.go() ? avo.ow : avo.ov;
   }

   @Override
   protected avn gm() {
      return avo.ou;
   }
}
