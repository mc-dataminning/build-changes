public class een {
   private static final ajc[] a = new ajc[]{
      new ajc("nether_fossils/fossil_1"),
      new ajc("nether_fossils/fossil_2"),
      new ajc("nether_fossils/fossil_3"),
      new ajc("nether_fossils/fossil_4"),
      new ajc("nether_fossils/fossil_5"),
      new ajc("nether_fossils/fossil_6"),
      new ajc("nether_fossils/fossil_7"),
      new ajc("nether_fossils/fossil_8"),
      new ajc("nether_fossils/fossil_9"),
      new ajc("nether_fossils/fossil_10"),
      new ajc("nether_fossils/fossil_11"),
      new ajc("nether_fossils/fossil_12"),
      new ajc("nether_fossils/fossil_13"),
      new ajc("nether_fossils/fossil_14")
   };

   public static void a(egh $$0, ecl $$1, awt $$2, ib $$3) {
      dfr $$4 = dfr.a($$2);
      $$1.a(new een.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ecq {
      public a(egh $$0, ajc $$1, ib $$2, dfr $$3) {
         super(ecx.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(egh $$0, sy $$1) {
         super(ecx.ac, $$1, $$0, $$1x -> a(dfr.valueOf($$1.l("Rot"))));
      }

      private static egc a(dfr $$0) {
         return new egc().a($$0).a(deb.a).a(efi.d);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cwt $$2, awt $$3, eby $$4) {
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
