public class dxc {
   private static final aez[] a = new aez[]{
      new aez("nether_fossils/fossil_1"),
      new aez("nether_fossils/fossil_2"),
      new aez("nether_fossils/fossil_3"),
      new aez("nether_fossils/fossil_4"),
      new aez("nether_fossils/fossil_5"),
      new aez("nether_fossils/fossil_6"),
      new aez("nether_fossils/fossil_7"),
      new aez("nether_fossils/fossil_8"),
      new aez("nether_fossils/fossil_9"),
      new aez("nether_fossils/fossil_10"),
      new aez("nether_fossils/fossil_11"),
      new aez("nether_fossils/fossil_12"),
      new aez("nether_fossils/fossil_13"),
      new aez("nether_fossils/fossil_14")
   };

   public static void a(dyw $$0, dvh $$1, ash $$2, gw $$3) {
      czn $$4 = czn.a($$2);
      $$1.a(new dxc.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvm {
      public a(dyw $$0, aez $$1, gw $$2, czn $$3) {
         super(dvt.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dyw $$0, qw $$1) {
         super(dvt.ac, $$1, $$0, $$1x -> a(czn.valueOf($$1.l("Rot"))));
      }

      private static dyr a(czn $$0) {
         return new dyr().a($$0).a(cxx.a).a(dxx.d);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
