public class ebn {
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

   public static void a(edh $$0, dzl $$1, auv $$2, hx $$3) {
      ddc $$4 = ddc.a($$2);
      $$1.a(new ebn.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dzq {
      public a(edh $$0, ahg $$1, hx $$2, ddc $$3) {
         super(dzx.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(edh $$0, sn $$1) {
         super(dzx.ac, $$1, $$0, $$1x -> a(ddc.valueOf($$1.l("Rot"))));
      }

      private static edc a(ddc $$0) {
         return new edc().a($$0).a(dbm.a).a(eci.d);
      }

      @Override
      protected void a(dzw $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cue $$2, auv $$3, dyy $$4) {
      }

      @Override
      public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
