public class ekp {
   private static final ale[] a = new ale[]{
      new ale("nether_fossils/fossil_1"),
      new ale("nether_fossils/fossil_2"),
      new ale("nether_fossils/fossil_3"),
      new ale("nether_fossils/fossil_4"),
      new ale("nether_fossils/fossil_5"),
      new ale("nether_fossils/fossil_6"),
      new ale("nether_fossils/fossil_7"),
      new ale("nether_fossils/fossil_8"),
      new ale("nether_fossils/fossil_9"),
      new ale("nether_fossils/fossil_10"),
      new ale("nether_fossils/fossil_11"),
      new ale("nether_fossils/fossil_12"),
      new ale("nether_fossils/fossil_13"),
      new ale("nether_fossils/fossil_14")
   };

   public static void a(emj $$0, ein $$1, azf $$2, iz $$3) {
      dlk $$4 = dlk.a($$2);
      $$1.a(new ekp.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eis {
      public a(emj $$0, ale $$1, iz $$2, dlk $$3) {
         super(eiz.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emj $$0, ur $$1) {
         super(eiz.ac, $$1, $$0, $$1x -> a(dlk.valueOf($$1.l("Rot"))));
      }

      private static eme a(dlk $$0) {
         return new eme().a($$0).a(dju.a).a(elk.d);
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
      }

      @Override
      public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
