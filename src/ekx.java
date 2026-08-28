public class ekx {
   private static final akk[] a = new akk[]{
      new akk("nether_fossils/fossil_1"),
      new akk("nether_fossils/fossil_2"),
      new akk("nether_fossils/fossil_3"),
      new akk("nether_fossils/fossil_4"),
      new akk("nether_fossils/fossil_5"),
      new akk("nether_fossils/fossil_6"),
      new akk("nether_fossils/fossil_7"),
      new akk("nether_fossils/fossil_8"),
      new akk("nether_fossils/fossil_9"),
      new akk("nether_fossils/fossil_10"),
      new akk("nether_fossils/fossil_11"),
      new akk("nether_fossils/fossil_12"),
      new akk("nether_fossils/fossil_13"),
      new akk("nether_fossils/fossil_14")
   };

   public static void a(emr $$0, eiv $$1, aym $$2, ja $$3) {
      dls $$4 = dls.a($$2);
      $$1.a(new ekx.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eja {
      public a(emr $$0, akk $$1, ja $$2, dls $$3) {
         super(ejh.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emr $$0, tx $$1) {
         super(ejh.ac, $$1, $$0, $$1x -> a(dls.valueOf($$1.l("Rot"))));
      }

      private static emm a(dls $$0) {
         return new emm().a($$0).a(dkc.a).a(els.d);
      }

      @Override
      protected void a(ejg $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ja $$1, dcs $$2, aym $$3, eii $$4) {
      }

      @Override
      public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
