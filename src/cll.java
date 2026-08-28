public class cll extends clv {
   public cll(bug<? extends cll> $$0, dev $$1) {
      super($$0, $$1);
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.v, 0.2F);
   }

   public static boolean b(bug<cll> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.am() != brv.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwd.a).a((double)($$0 * 3));
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   protected lo t() {
      return lq.F;
   }

   @Override
   public boolean bZ() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gr() {
      this.e *= 0.9F;
   }

   @Override
   public void v() {
      ezh $$0 = this.dA();
      float $$1 = (float)this.gw() * 0.1F;
      this.n($$0.d, (double)(this.fl() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axp<erd> $$0) {
      if ($$0 == axf.b) {
         ezh $$1 = this.dA();
         this.n($$1.d, (double)(0.22F + (float)this.gw() * 0.05F), $$1.f);
         this.as = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gs() {
      return this.dk();
   }

   @Override
   protected float gt() {
      return super.gt() + 2.0F;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.gx() ? awk.os : awk.or;
   }

   @Override
   protected awj o_() {
      return this.gx() ? awk.og : awk.oq;
   }

   @Override
   protected awj gu() {
      return this.gx() ? awk.ov : awk.ou;
   }

   @Override
   protected awj gv() {
      return awk.ot;
   }
}
