public class ekq {
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

   public static void a(emk $$0, eio $$1, azg $$2, iz $$3) {
      dll $$4 = dll.a($$2);
      $$1.a(new ekq.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eit {
      public a(emk $$0, ale $$1, iz $$2, dll $$3) {
         super(eja.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emk $$0, ur $$1) {
         super(eja.ac, $$1, $$0, $$1x -> a(dll.valueOf($$1.l("Rot"))));
      }

      private static emf a(dll $$0) {
         return new emf().a($$0).a(djv.a).a(ell.d);
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
      }

      @Override
      public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
