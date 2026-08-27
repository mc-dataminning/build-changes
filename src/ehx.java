public class ehx {
   private static final ajv[] a = new ajv[]{
      new ajv("nether_fossils/fossil_1"),
      new ajv("nether_fossils/fossil_2"),
      new ajv("nether_fossils/fossil_3"),
      new ajv("nether_fossils/fossil_4"),
      new ajv("nether_fossils/fossil_5"),
      new ajv("nether_fossils/fossil_6"),
      new ajv("nether_fossils/fossil_7"),
      new ajv("nether_fossils/fossil_8"),
      new ajv("nether_fossils/fossil_9"),
      new ajv("nether_fossils/fossil_10"),
      new ajv("nether_fossils/fossil_11"),
      new ajv("nether_fossils/fossil_12"),
      new ajv("nether_fossils/fossil_13"),
      new ajv("nether_fossils/fossil_14")
   };

   public static void a(ejr $$0, efv $$1, axt $$2, id $$3) {
      dit $$4 = dit.a($$2);
      $$1.a(new ehx.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ega {
      public a(ejr $$0, ajv $$1, id $$2, dit $$3) {
         super(egh.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ejr $$0, to $$1) {
         super(egh.ac, $$1, $$0, $$1x -> a(dit.valueOf($$1.l("Rot"))));
      }

      private static ejm a(dit $$0) {
         return new ejm().a($$0).a(dhd.a).a(eis.d);
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
