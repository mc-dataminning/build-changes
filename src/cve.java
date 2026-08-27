public class cve extends csm implements cvd {
   public cve(dez.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      $$1.a($$2, this, this.a());
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      $$3.a($$4, this, this.a());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         byf $$4 = byf.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(byf $$0) {
   }

   protected int a() {
      return 2;
   }

   public static boolean h(dfa $$0) {
      return $$0.i() || $$0.a(apl.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$3.a(16) == 0) {
         gu $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            ars.a($$1, $$2, $$3, new in(iv.z, $$0));
         }
      }
   }

   public int d(dfa $$0, cos $$1, gu $$2) {
      return -16777216;
   }
}
