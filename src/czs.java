public class czs extends dag implements dbe {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public czs(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      if ($$1 instanceof asb $$2) {
         dak $$3 = $$0.n();
         fgc $$4 = $$0.l();
         jc $$5 = $$0.k();
         ctd.a(new csy($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bvc.a;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      if ($$1.fJ()) {
         dak $$3 = $$1.b($$2);
         if ($$0 instanceof asb $$4) {
            ctd.a(new csy($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axi.c.b(this));
         }

         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      return new csy($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public dbe.a a() {
      return dbe.a.a().a(czs::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fgc a(lf $$0, jc $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
