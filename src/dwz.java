public class dwz {
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

   public static void a(dyt $$0, dve $$1, aru $$2, gu $$3) {
      cyy $$4 = cyy.a($$2);
      $$1.a(new dwz.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvj {
      public a(dyt $$0, aer $$1, gu $$2, cyy $$3) {
         super(dvq.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dyt $$0, qr $$1) {
         super(dvq.ac, $$1, $$0, $$1x -> a(cyy.valueOf($$1.l("Rot"))));
      }

      private static dyo a(cyy $$0) {
         return new dyo().a($$0).a(cxh.a).a(dxu.d);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cqb $$2, aru $$3, dur $$4) {
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
