public abstract class cjq extends cjv {
   private static final bxh bI = bxn.D.n().a(0.5F).b(0.665F);

   public cjq(bxn<? extends cjq> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cfu(this, 2.0));
      this.bF.a(2, new cen(this, 1.0));
      this.bF.a(3, new cgj(this, 1.25, $$0 -> $$0.a(axv.af), false));
      this.bF.a(4, new cfa(this, 1.25));
      this.bF.a(5, new cgo(this, 1.0));
      this.bF.a(6, new cfj(this, csi.class, 6.0F));
      this.bF.a(7, new cfw(this));
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.af);
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.v, 0.2F);
   }

   @Override
   protected awx u() {
      return awy.gf;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.gh;
   }

   @Override
   protected awx l_() {
      return awy.gg;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.ro) && !this.n_()) {
         $$0.a(awy.gi, 1.0F, 1.0F);
         dak $$3 = dan.a($$2, $$0, dao.ru.m());
         $$0.a($$1, $$3);
         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? bI : super.e($$0);
   }
}
