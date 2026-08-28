import javax.annotation.Nullable;

public class chz extends chs {
   private static final bvi bZ = bvm.C.n().a(0.5F).b(0.665F);

   public chz(bvm<? extends chz> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cds(this, 2.0));
      this.bT.a(2, new ccl(this, 1.0));
      this.bT.a(3, new ceh(this, 1.25, $$0 -> $$0.a(ayd.af), false));
      this.bT.a(4, new ccy(this, 1.25));
      this.bT.a(5, new cem(this, 1.0));
      this.bT.a(6, new cdh(this, cps.class, 6.0F));
      this.bT.a(7, new cdu(this));
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.af);
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 10.0).a(bxj.v, 0.2F);
   }

   @Override
   protected axe u() {
      return axf.gc;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ge;
   }

   @Override
   protected axe o_() {
      return axf.gd;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.qW) && !this.e_()) {
         $$0.a(axf.gf, 1.0F, 1.0F);
         cxk $$3 = cxn.a($$2, $$0, cxo.rc.n());
         $$0.a($$1, $$3);
         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chz b(ash $$0, buw $$1) {
      return bvm.C.a($$0, bvl.e);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
