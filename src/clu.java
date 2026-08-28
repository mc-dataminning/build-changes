public class clu extends cme {
   public clu(bup<? extends clu> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.v, 0.2F);
   }

   public static boolean b(bup<clu> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.ak() != bse.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bwm.a).a((double)($$0 * 3));
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Override
   protected lq t() {
      return ls.F;
   }

   @Override
   public boolean ca() {
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
      ezr $$0 = this.dB();
      float $$1 = (float)this.gw() * 0.1F;
      this.n($$0.d, (double)(this.fm() + $$1), $$0.f);
      this.as = true;
   }

   @Override
   protected void c(axt<ern> $$0) {
      if ($$0 == axj.b) {
         ezr $$1 = this.dB();
         this.n($$1.d, (double)(0.22F + (float)this.gw() * 0.05F), $$1.f);
         this.as = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gs() {
      return this.dl();
   }

   @Override
   protected float gt() {
      return super.gt() + 2.0F;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.gx() ? awo.os : awo.or;
   }

   @Override
   protected awn o_() {
      return this.gx() ? awo.og : awo.oq;
   }

   @Override
   protected awn gu() {
      return this.gx() ? awo.ov : awo.ou;
   }

   @Override
   protected awn gv() {
      return awo.ot;
   }
}
