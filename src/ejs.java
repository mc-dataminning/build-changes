public class ejs {
   private static final akn[] a = new akn[]{
      new akn("nether_fossils/fossil_1"),
      new akn("nether_fossils/fossil_2"),
      new akn("nether_fossils/fossil_3"),
      new akn("nether_fossils/fossil_4"),
      new akn("nether_fossils/fossil_5"),
      new akn("nether_fossils/fossil_6"),
      new akn("nether_fossils/fossil_7"),
      new akn("nether_fossils/fossil_8"),
      new akn("nether_fossils/fossil_9"),
      new akn("nether_fossils/fossil_10"),
      new akn("nether_fossils/fossil_11"),
      new akn("nether_fossils/fossil_12"),
      new akn("nether_fossils/fossil_13"),
      new akn("nether_fossils/fossil_14")
   };

   public static void a(elm $$0, ehq $$1, aym $$2, io $$3) {
      dkn $$4 = dkn.a($$2);
      $$1.a(new ejs.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ehv {
      public a(elm $$0, akn $$1, io $$2, dkn $$3) {
         super(eic.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(elm $$0, ud $$1) {
         super(eic.ac, $$1, $$0, $$1x -> a(dkn.valueOf($$1.l("Rot"))));
      }

      private static elh a(dkn $$0) {
         return new elh().a($$0).a(dix.a).a(ekn.d);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
