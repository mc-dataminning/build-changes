import javax.annotation.Nullable;

public class cie extends chx {
   private static final bvn bZ = bvr.C.n().a(0.5F).b(0.665F);

   public cie(bvr<? extends cie> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cdx(this, 2.0));
      this.bT.a(2, new ccq(this, 1.0));
      this.bT.a(3, new cem(this, 1.25, $$0 -> $$0.a(ayd.af), false));
      this.bT.a(4, new cdd(this, 1.25));
      this.bT.a(5, new cer(this, 1.0));
      this.bT.a(6, new cdm(this, cpx.class, 6.0F));
      this.bT.a(7, new cdz(this));
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.af);
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.v, 0.2F);
   }

   @Override
   protected axe u() {
      return axf.gd;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.gf;
   }

   @Override
   protected axe o_() {
      return axf.ge;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.qW) && !this.e_()) {
         $$0.a(axf.gg, 1.0F, 1.0F);
         cxp $$3 = cxs.a($$2, $$0, cxt.rc.n());
         $$0.a($$1, $$3);
         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cie b(ash $$0, bvb $$1) {
      return bvr.C.a($$0, bvq.e);
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
