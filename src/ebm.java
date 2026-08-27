public class ebm {
   private static final ahg[] a = new ahg[]{
      new ahg("nether_fossils/fossil_1"),
      new ahg("nether_fossils/fossil_2"),
      new ahg("nether_fossils/fossil_3"),
      new ahg("nether_fossils/fossil_4"),
      new ahg("nether_fossils/fossil_5"),
      new ahg("nether_fossils/fossil_6"),
      new ahg("nether_fossils/fossil_7"),
      new ahg("nether_fossils/fossil_8"),
      new ahg("nether_fossils/fossil_9"),
      new ahg("nether_fossils/fossil_10"),
      new ahg("nether_fossils/fossil_11"),
      new ahg("nether_fossils/fossil_12"),
      new ahg("nether_fossils/fossil_13"),
      new ahg("nether_fossils/fossil_14")
   };

   public static void a(edg $$0, dzk $$1, auu $$2, hx $$3) {
      ddb $$4 = ddb.a($$2);
      $$1.a(new ebm.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dzp {
      public a(edg $$0, ahg $$1, hx $$2, ddb $$3) {
         super(dzw.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(edg $$0, sn $$1) {
         super(dzw.ac, $$1, $$0, $$1x -> a(ddb.valueOf($$1.l("Rot"))));
      }

      private static edb a(ddb $$0) {
         return new edb().a($$0).a(dbl.a).a(ech.d);
      }

      @Override
      protected void a(dzv $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cud $$2, auu $$3, dyx $$4) {
      }

      @Override
      public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
