public class efl {
   private static final ajh[] a = new ajh[]{
      new ajh("nether_fossils/fossil_1"),
      new ajh("nether_fossils/fossil_2"),
      new ajh("nether_fossils/fossil_3"),
      new ajh("nether_fossils/fossil_4"),
      new ajh("nether_fossils/fossil_5"),
      new ajh("nether_fossils/fossil_6"),
      new ajh("nether_fossils/fossil_7"),
      new ajh("nether_fossils/fossil_8"),
      new ajh("nether_fossils/fossil_9"),
      new ajh("nether_fossils/fossil_10"),
      new ajh("nether_fossils/fossil_11"),
      new ajh("nether_fossils/fossil_12"),
      new ajh("nether_fossils/fossil_13"),
      new ajh("nether_fossils/fossil_14")
   };

   public static void a(ehf $$0, edj $$1, axd $$2, ib $$3) {
      dgo $$4 = dgo.a($$2);
      $$1.a(new efl.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends edo {
      public a(ehf $$0, ajh $$1, ib $$2, dgo $$3) {
         super(edv.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ehf $$0, ta $$1) {
         super(edv.ac, $$1, $$0, $$1x -> a(dgo.valueOf($$1.l("Rot"))));
      }

      private static eha a(dgo $$0) {
         return new eha().a($$0).a(dey.a).a(egg.d);
      }

      @Override
      protected void a(edu $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cxq $$2, axd $$3, ecw $$4) {
      }

      @Override
      public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
