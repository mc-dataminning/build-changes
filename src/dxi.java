public class dxi {
   private static final aew[] a = new aew[]{
      new aew("nether_fossils/fossil_1"),
      new aew("nether_fossils/fossil_2"),
      new aew("nether_fossils/fossil_3"),
      new aew("nether_fossils/fossil_4"),
      new aew("nether_fossils/fossil_5"),
      new aew("nether_fossils/fossil_6"),
      new aew("nether_fossils/fossil_7"),
      new aew("nether_fossils/fossil_8"),
      new aew("nether_fossils/fossil_9"),
      new aew("nether_fossils/fossil_10"),
      new aew("nether_fossils/fossil_11"),
      new aew("nether_fossils/fossil_12"),
      new aew("nether_fossils/fossil_13"),
      new aew("nether_fossils/fossil_14")
   };

   public static void a(dzc $$0, dvn $$1, asc $$2, gw $$3) {
      czh $$4 = czh.a($$2);
      $$1.a(new dxi.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvs {
      public a(dzc $$0, aew $$1, gw $$2, czh $$3) {
         super(dvz.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dzc $$0, qw $$1) {
         super(dvz.ac, $$1, $$0, $$1x -> a(czh.valueOf($$1.l("Rot"))));
      }

      private static dyx a(czh $$0) {
         return new dyx().a($$0).a(cxq.a).a(dyd.d);
      }

      @Override
      protected void a(dvy $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
      }

      @Override
      public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
