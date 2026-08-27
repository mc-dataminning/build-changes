public class dxk {
   private static final aey[] a = new aey[]{
      new aey("nether_fossils/fossil_1"),
      new aey("nether_fossils/fossil_2"),
      new aey("nether_fossils/fossil_3"),
      new aey("nether_fossils/fossil_4"),
      new aey("nether_fossils/fossil_5"),
      new aey("nether_fossils/fossil_6"),
      new aey("nether_fossils/fossil_7"),
      new aey("nether_fossils/fossil_8"),
      new aey("nether_fossils/fossil_9"),
      new aey("nether_fossils/fossil_10"),
      new aey("nether_fossils/fossil_11"),
      new aey("nether_fossils/fossil_12"),
      new aey("nether_fossils/fossil_13"),
      new aey("nether_fossils/fossil_14")
   };

   public static void a(dze $$0, dvp $$1, ase $$2, gw $$3) {
      czj $$4 = czj.a($$2);
      $$1.a(new dxk.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvu {
      public a(dze $$0, aey $$1, gw $$2, czj $$3) {
         super(dwb.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dze $$0, qy $$1) {
         super(dwb.ac, $$1, $$0, $$1x -> a(czj.valueOf($$1.l("Rot"))));
      }

      private static dyz a(czj $$0) {
         return new dyz().a($$0).a(cxs.a).a(dyf.d);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
