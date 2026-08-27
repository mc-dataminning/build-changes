public class eiw {
   private static final akh[] a = new akh[]{
      new akh("nether_fossils/fossil_1"),
      new akh("nether_fossils/fossil_2"),
      new akh("nether_fossils/fossil_3"),
      new akh("nether_fossils/fossil_4"),
      new akh("nether_fossils/fossil_5"),
      new akh("nether_fossils/fossil_6"),
      new akh("nether_fossils/fossil_7"),
      new akh("nether_fossils/fossil_8"),
      new akh("nether_fossils/fossil_9"),
      new akh("nether_fossils/fossil_10"),
      new akh("nether_fossils/fossil_11"),
      new akh("nether_fossils/fossil_12"),
      new akh("nether_fossils/fossil_13"),
      new akh("nether_fossils/fossil_14")
   };

   public static void a(ekq $$0, egu $$1, ayg $$2, in $$3) {
      djr $$4 = djr.a($$2);
      $$1.a(new eiw.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends egz {
      public a(ekq $$0, akh $$1, in $$2, djr $$3) {
         super(ehg.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ekq $$0, ua $$1) {
         super(ehg.ac, $$1, $$0, $$1x -> a(djr.valueOf($$1.l("Rot"))));
      }

      private static ekl a(djr $$0) {
         return new ekl().a($$0).a(dib.a).a(ejr.d);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
