public class eld {
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

   public static void a(emx $$0, ejb $$1, ayo $$2, ja $$3) {
      dlu $$4 = dlu.a($$2);
      $$1.a(new eld.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ejg {
      public a(emx $$0, akk $$1, ja $$2, dlu $$3) {
         super(ejn.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emx $$0, tx $$1) {
         super(ejn.ac, $$1, $$0, $$1x -> a(dlu.valueOf($$1.l("Rot"))));
      }

      private static ems a(dlu $$0) {
         return new ems().a($$0).a(dke.a).a(ely.d);
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
      }

      @Override
      public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
