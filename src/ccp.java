import javax.annotation.Nullable;

public class ccp extends cci {
   private static final bqd bX = bqg.w.n().a(0.5F).b(0.665F);

   public ccp(bqg<? extends ccp> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new byj(this, 2.0));
      this.bR.a(2, new bxc(this, 1.0));
      this.bR.a(3, new byy(this, 1.25, cvp.a(crv.pv), false));
      this.bR.a(4, new bxp(this, 1.25));
      this.bR.a(5, new bzd(this, 1.0));
      this.bR.a(6, new bxy(this, cka.class, 6.0F));
      this.bR.a(7, new byl(this));
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 0.2F);
   }

   @Override
   protected aun v() {
      return auo.fW;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.fY;
   }

   @Override
   protected aun o_() {
      return auo.fX;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ga, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.qx) && !this.p_()) {
         $$0.a(auo.fZ, 1.0F, 1.0F);
         crs $$3 = cru.a($$2, $$0, crv.qD.x());
         $$0.a($$1, $$3);
         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public ccp b(apu $$0, bpu $$1) {
      return bqg.w.a((czg)$$0);
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? bX : super.e($$0);
   }
}
