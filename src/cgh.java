import javax.annotation.Nullable;

public class cgh extends cga {
   private static final btr bY = btv.w.n().a(0.5F).b(0.665F);

   public cgh(btv<? extends cgh> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cca(this, 2.0));
      this.bS.a(2, new cat(this, 1.0));
      this.bS.a(3, new ccp(this, 1.25, $$0 -> $$0.a(axc.aa), false));
      this.bS.a(4, new cbg(this, 1.25));
      this.bS.a(5, new ccu(this, 1.0));
      this.bS.a(6, new cbp(this, cnu.class, 6.0F));
      this.bS.a(7, new ccc(this));
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.aa);
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.v, 0.2F);
   }

   @Override
   protected awd w() {
      return awe.gc;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.ge;
   }

   @Override
   protected awd n_() {
      return awe.gd;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.qz) && !this.o_()) {
         $$0.a(awe.gf, 1.0F, 1.0F);
         cvp $$3 = cvs.a($$2, $$0, cvt.qF.v());
         $$0.a($$1, $$3);
         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cgh b(arh $$0, bth $$1) {
      return btv.w.a($$0, btu.e);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? bY : super.e($$0);
   }
}
