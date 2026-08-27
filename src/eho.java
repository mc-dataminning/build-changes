public class eho {
   private static final ajt[] a = new ajt[]{
      new ajt("nether_fossils/fossil_1"),
      new ajt("nether_fossils/fossil_2"),
      new ajt("nether_fossils/fossil_3"),
      new ajt("nether_fossils/fossil_4"),
      new ajt("nether_fossils/fossil_5"),
      new ajt("nether_fossils/fossil_6"),
      new ajt("nether_fossils/fossil_7"),
      new ajt("nether_fossils/fossil_8"),
      new ajt("nether_fossils/fossil_9"),
      new ajt("nether_fossils/fossil_10"),
      new ajt("nether_fossils/fossil_11"),
      new ajt("nether_fossils/fossil_12"),
      new ajt("nether_fossils/fossil_13"),
      new ajt("nether_fossils/fossil_14")
   };

   public static void a(eji $$0, efm $$1, axr $$2, ib $$3) {
      dik $$4 = dik.a($$2);
      $$1.a(new eho.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends efr {
      public a(eji $$0, ajt $$1, ib $$2, dik $$3) {
         super(efy.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eji $$0, tm $$1) {
         super(efy.ac, $$1, $$0, $$1x -> a(dik.valueOf($$1.l("Rot"))));
      }

      private static ejd a(dik $$0) {
         return new ejd().a($$0).a(dgu.a).a(eij.d);
      }

      @Override
      protected void a(efx $$0, tm $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, czm $$2, axr $$3, eez $$4) {
      }

      @Override
      public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
