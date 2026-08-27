public class ctv extends cvd {
   private final dez a;

   public ctv(csl $$0, dey.d $$1) {
      super($$1);
      this.a = $$0.n();
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, dez $$3, bye $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }
   }

   @Override
   public dez a(clf $$0) {
      cor $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(cor $$0, gu $$1, dez $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cor $$0, gu $$1) {
      boolean $$2 = false;
      gu.a $$3 = $$1.j();

      for (ha $$4 : ha.values()) {
         dez $$5 = $$0.a_($$3);
         if ($$4 != ha.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dez $$0) {
      return $$0.u().a(apq.a);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dez $$0, cor $$1, gu $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
