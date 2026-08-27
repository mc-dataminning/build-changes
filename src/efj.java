public class efj {
   private static final ajh[] a = new ajh[]{
      new ajh("nether_fossils/fossil_1"),
      new ajh("nether_fossils/fossil_2"),
      new ajh("nether_fossils/fossil_3"),
      new ajh("nether_fossils/fossil_4"),
      new ajh("nether_fossils/fossil_5"),
      new ajh("nether_fossils/fossil_6"),
      new ajh("nether_fossils/fossil_7"),
      new ajh("nether_fossils/fossil_8"),
      new ajh("nether_fossils/fossil_9"),
      new ajh("nether_fossils/fossil_10"),
      new ajh("nether_fossils/fossil_11"),
      new ajh("nether_fossils/fossil_12"),
      new ajh("nether_fossils/fossil_13"),
      new ajh("nether_fossils/fossil_14")
   };

   public static void a(ehd $$0, edh $$1, axd $$2, ib $$3) {
      dgm $$4 = dgm.a($$2);
      $$1.a(new efj.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends edm {
      public a(ehd $$0, ajh $$1, ib $$2, dgm $$3) {
         super(edt.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ehd $$0, ta $$1) {
         super(edt.ac, $$1, $$0, $$1x -> a(dgm.valueOf($$1.l("Rot"))));
      }

      private static egy a(dgm $$0) {
         return new egy().a($$0).a(dew.a).a(ege.d);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cxo $$2, axd $$3, ecu $$4) {
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
