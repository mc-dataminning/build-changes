public class ein {
   private static final akf[] a = new akf[]{
      new akf("nether_fossils/fossil_1"),
      new akf("nether_fossils/fossil_2"),
      new akf("nether_fossils/fossil_3"),
      new akf("nether_fossils/fossil_4"),
      new akf("nether_fossils/fossil_5"),
      new akf("nether_fossils/fossil_6"),
      new akf("nether_fossils/fossil_7"),
      new akf("nether_fossils/fossil_8"),
      new akf("nether_fossils/fossil_9"),
      new akf("nether_fossils/fossil_10"),
      new akf("nether_fossils/fossil_11"),
      new akf("nether_fossils/fossil_12"),
      new akf("nether_fossils/fossil_13"),
      new akf("nether_fossils/fossil_14")
   };

   public static void a(ekh $$0, egl $$1, ayd $$2, im $$3) {
      dji $$4 = dji.a($$2);
      $$1.a(new ein.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends egq {
      public a(ekh $$0, akf $$1, im $$2, dji $$3) {
         super(egx.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ekh $$0, ty $$1) {
         super(egx.ac, $$1, $$0, $$1x -> a(dji.valueOf($$1.l("Rot"))));
      }

      private static ekc a(dji $$0) {
         return new ekc().a($$0).a(dhs.a).a(eji.d);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
