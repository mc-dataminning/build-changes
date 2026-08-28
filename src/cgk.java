import javax.annotation.Nullable;

public class cgk extends cgd {
   private static final btu bY = bty.w.n().a(0.5F).b(0.665F);

   public cgk(bty<? extends cgk> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ccd(this, 2.0));
      this.bS.a(2, new caw(this, 1.0));
      this.bS.a(3, new ccs(this, 1.25, $$0 -> $$0.a(axe.aa), false));
      this.bS.a(4, new cbj(this, 1.25));
      this.bS.a(5, new ccx(this, 1.0));
      this.bS.a(6, new cbs(this, cnx.class, 6.0F));
      this.bS.a(7, new ccf(this));
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.aa);
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.v, 0.2F);
   }

   @Override
   protected awf w() {
      return awg.gc;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.ge;
   }

   @Override
   protected awf o_() {
      return awg.gd;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.qz) && !this.p_()) {
         $$0.a(awg.gf, 1.0F, 1.0F);
         cvs $$3 = cvv.a($$2, $$0, cvw.qF.v());
         $$0.a($$1, $$3);
         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cgk b(arj $$0, btk $$1) {
      return bty.w.a($$0, btx.e);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
