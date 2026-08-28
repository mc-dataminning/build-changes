import javax.annotation.Nullable;

public class cid extends chw {
   private static final bvm bZ = bvq.C.n().a(0.5F).b(0.665F);

   public cid(bvq<? extends cid> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cdw(this, 2.0));
      this.bT.a(2, new ccp(this, 1.0));
      this.bT.a(3, new cel(this, 1.25, $$0 -> $$0.a(ayd.af), false));
      this.bT.a(4, new cdc(this, 1.25));
      this.bT.a(5, new ceq(this, 1.0));
      this.bT.a(6, new cdl(this, cpw.class, 6.0F));
      this.bT.a(7, new cdy(this));
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.af);
   }

   public static bxm.a p() {
      return chw.gt().a(bxn.s, 10.0).a(bxn.v, 0.2F);
   }

   @Override
   protected axe u() {
      return axf.gd;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.gf;
   }

   @Override
   protected axe o_() {
      return axf.ge;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.qW) && !this.e_()) {
         $$0.a(axf.gg, 1.0F, 1.0F);
         cxo $$3 = cxr.a($$2, $$0, cxs.rc.n());
         $$0.a($$1, $$3);
         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cid b(ash $$0, bva $$1) {
      return bvq.C.a($$0, bvp.e);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
