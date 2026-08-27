public class dzt {
   private static final agm[] a = new agm[]{
      new agm("nether_fossils/fossil_1"),
      new agm("nether_fossils/fossil_2"),
      new agm("nether_fossils/fossil_3"),
      new agm("nether_fossils/fossil_4"),
      new agm("nether_fossils/fossil_5"),
      new agm("nether_fossils/fossil_6"),
      new agm("nether_fossils/fossil_7"),
      new agm("nether_fossils/fossil_8"),
      new agm("nether_fossils/fossil_9"),
      new agm("nether_fossils/fossil_10"),
      new agm("nether_fossils/fossil_11"),
      new agm("nether_fossils/fossil_12"),
      new agm("nether_fossils/fossil_13"),
      new agm("nether_fossils/fossil_14")
   };

   public static void a(ebn $$0, dxr $$1, atw $$2, hx $$3) {
      dbr $$4 = dbr.a($$2);
      $$1.a(new dzt.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dxw {
      public a(ebn $$0, agm $$1, hx $$2, dbr $$3) {
         super(dyd.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ebn $$0, sd $$1) {
         super(dyd.ac, $$1, $$0, $$1x -> a(dbr.valueOf($$1.l("Rot"))));
      }

      private static ebi a(dbr $$0) {
         return new ebi().a($$0).a(dab.a).a(eao.d);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, csu $$2, atw $$3, dxe $$4) {
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
