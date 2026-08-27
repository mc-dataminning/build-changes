public class dwx {
   private static final aep[] a = new aep[]{
      new aep("nether_fossils/fossil_1"),
      new aep("nether_fossils/fossil_2"),
      new aep("nether_fossils/fossil_3"),
      new aep("nether_fossils/fossil_4"),
      new aep("nether_fossils/fossil_5"),
      new aep("nether_fossils/fossil_6"),
      new aep("nether_fossils/fossil_7"),
      new aep("nether_fossils/fossil_8"),
      new aep("nether_fossils/fossil_9"),
      new aep("nether_fossils/fossil_10"),
      new aep("nether_fossils/fossil_11"),
      new aep("nether_fossils/fossil_12"),
      new aep("nether_fossils/fossil_13"),
      new aep("nether_fossils/fossil_14")
   };

   public static void a(dyr $$0, dvc $$1, art $$2, gv $$3) {
      cyw $$4 = cyw.a($$2);
      $$1.a(new dwx.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvh {
      public a(dyr $$0, aep $$1, gv $$2, cyw $$3) {
         super(dvo.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dyr $$0, qs $$1) {
         super(dvo.ac, $$1, $$0, $$1x -> a(cyw.valueOf($$1.l("Rot"))));
      }

      private static dym a(cyw $$0) {
         return new dym().a($$0).a(cxf.a).a(dxs.d);
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
      }

      @Override
      public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
