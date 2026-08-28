public class ekr {
   private static final alf[] a = new alf[]{
      new alf("nether_fossils/fossil_1"),
      new alf("nether_fossils/fossil_2"),
      new alf("nether_fossils/fossil_3"),
      new alf("nether_fossils/fossil_4"),
      new alf("nether_fossils/fossil_5"),
      new alf("nether_fossils/fossil_6"),
      new alf("nether_fossils/fossil_7"),
      new alf("nether_fossils/fossil_8"),
      new alf("nether_fossils/fossil_9"),
      new alf("nether_fossils/fossil_10"),
      new alf("nether_fossils/fossil_11"),
      new alf("nether_fossils/fossil_12"),
      new alf("nether_fossils/fossil_13"),
      new alf("nether_fossils/fossil_14")
   };

   public static void a(eml $$0, eip $$1, azh $$2, iz $$3) {
      dlm $$4 = dlm.a($$2);
      $$1.a(new ekr.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eiu {
      public a(eml $$0, alf $$1, iz $$2, dlm $$3) {
         super(ejb.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eml $$0, us $$1) {
         super(ejb.ac, $$1, $$0, $$1x -> a(dlm.valueOf($$1.l("Rot"))));
      }

      private static emg a(dlm $$0) {
         return new emg().a($$0).a(djw.a).a(elm.d);
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcn $$2, azh $$3, eic $$4) {
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
