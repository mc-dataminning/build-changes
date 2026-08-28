import javax.annotation.Nullable;

public class chc extends cgv {
   private static final bul bY = bup.w.n().a(0.5F).b(0.665F);

   public chc(bup<? extends chc> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new ccv(this, 2.0));
      this.bS.a(2, new cbo(this, 1.0));
      this.bS.a(3, new cdk(this, 1.25, $$0 -> $$0.a(axm.ae), false));
      this.bS.a(4, new ccb(this, 1.25));
      this.bS.a(5, new cdp(this, 1.0));
      this.bS.a(6, new cck(this, cor.class, 6.0F));
      this.bS.a(7, new ccx(this));
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ae);
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.v, 0.2F);
   }

   @Override
   protected awn w() {
      return awo.gc;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ge;
   }

   @Override
   protected awn o_() {
      return awo.gd;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fj() {
      return 0.4F;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.qz) && !this.p_()) {
         $$0.a(awo.gf, 1.0F, 1.0F);
         cwf $$3 = cwi.a($$2, $$0, cwj.qF.o());
         $$0.a($$1, $$3);
         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chc b(arq $$0, btz $$1) {
      return bup.w.a($$0, buo.e);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
