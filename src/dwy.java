public class dwy {
   private static final aer[] a = new aer[]{
      new aer("nether_fossils/fossil_1"),
      new aer("nether_fossils/fossil_2"),
      new aer("nether_fossils/fossil_3"),
      new aer("nether_fossils/fossil_4"),
      new aer("nether_fossils/fossil_5"),
      new aer("nether_fossils/fossil_6"),
      new aer("nether_fossils/fossil_7"),
      new aer("nether_fossils/fossil_8"),
      new aer("nether_fossils/fossil_9"),
      new aer("nether_fossils/fossil_10"),
      new aer("nether_fossils/fossil_11"),
      new aer("nether_fossils/fossil_12"),
      new aer("nether_fossils/fossil_13"),
      new aer("nether_fossils/fossil_14")
   };

   public static void a(dys $$0, dvd $$1, aru $$2, gu $$3) {
      cyx $$4 = cyx.a($$2);
      $$1.a(new dwy.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvi {
      public a(dys $$0, aer $$1, gu $$2, cyx $$3) {
         super(dvp.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dys $$0, qr $$1) {
         super(dvp.ac, $$1, $$0, $$1x -> a(cyx.valueOf($$1.l("Rot"))));
      }

      private static dyn a(cyx $$0) {
         return new dyn().a($$0).a(cxg.a).a(dxt.d);
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cqa $$2, aru $$3, duq $$4) {
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
