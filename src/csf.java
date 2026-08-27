public class csf extends cpn implements cse {
   public csf(dca.d $$0) {
      super($$0);
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      $$1.a($$2, this, this.a());
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      $$3.a($$4, this, this.a());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         bvg $$4 = bvg.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(bvg $$0) {
   }

   protected int a() {
      return 2;
   }

   public static boolean h(dcb $$0) {
      return $$0.i() || $$0.a(amw.aI) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$3.a(16) == 0) {
         gu $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            apd.a($$1, $$2, $$3, new in(iv.z, $$0));
         }
      }
   }

   public int d(dcb $$0, cls $$1, gu $$2) {
      return -16777216;
   }
}
