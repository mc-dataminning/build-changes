public class dzo {
   private static final agi[] a = new agi[]{
      new agi("nether_fossils/fossil_1"),
      new agi("nether_fossils/fossil_2"),
      new agi("nether_fossils/fossil_3"),
      new agi("nether_fossils/fossil_4"),
      new agi("nether_fossils/fossil_5"),
      new agi("nether_fossils/fossil_6"),
      new agi("nether_fossils/fossil_7"),
      new agi("nether_fossils/fossil_8"),
      new agi("nether_fossils/fossil_9"),
      new agi("nether_fossils/fossil_10"),
      new agi("nether_fossils/fossil_11"),
      new agi("nether_fossils/fossil_12"),
      new agi("nether_fossils/fossil_13"),
      new agi("nether_fossils/fossil_14")
   };

   public static void a(ebi $$0, dxm $$1, ats $$2, ht $$3) {
      dbm $$4 = dbm.a($$2);
      $$1.a(new dzo.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dxr {
      public a(ebi $$0, agi $$1, ht $$2, dbm $$3) {
         super(dxy.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ebi $$0, rz $$1) {
         super(dxy.ac, $$1, $$0, $$1x -> a(dbm.valueOf($$1.l("Rot"))));
      }

      private static ebd a(dbm $$0) {
         return new ebd().a($$0).a(czw.a).a(eaj.d);
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
      }

      @Override
      public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
