public class eds {
   private static final aiy[] a = new aiy[]{
      new aiy("nether_fossils/fossil_1"),
      new aiy("nether_fossils/fossil_2"),
      new aiy("nether_fossils/fossil_3"),
      new aiy("nether_fossils/fossil_4"),
      new aiy("nether_fossils/fossil_5"),
      new aiy("nether_fossils/fossil_6"),
      new aiy("nether_fossils/fossil_7"),
      new aiy("nether_fossils/fossil_8"),
      new aiy("nether_fossils/fossil_9"),
      new aiy("nether_fossils/fossil_10"),
      new aiy("nether_fossils/fossil_11"),
      new aiy("nether_fossils/fossil_12"),
      new aiy("nether_fossils/fossil_13"),
      new aiy("nether_fossils/fossil_14")
   };

   public static void a(efm $$0, ebq $$1, awp $$2, hz $$3) {
      dfe $$4 = dfe.a($$2);
      $$1.a(new eds.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ebv {
      public a(efm $$0, aiy $$1, hz $$2, dfe $$3) {
         super(ecc.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(efm $$0, sw $$1) {
         super(ecc.ac, $$1, $$0, $$1x -> a(dfe.valueOf($$1.l("Rot"))));
      }

      private static efh a(dfe $$0) {
         return new efh().a($$0).a(ddo.a).a(een.d);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hz $$1, cwg $$2, awp $$3, ebd $$4) {
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
