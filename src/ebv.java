public class ebv {
   private static final ahh[] a = new ahh[]{
      new ahh("nether_fossils/fossil_1"),
      new ahh("nether_fossils/fossil_2"),
      new ahh("nether_fossils/fossil_3"),
      new ahh("nether_fossils/fossil_4"),
      new ahh("nether_fossils/fossil_5"),
      new ahh("nether_fossils/fossil_6"),
      new ahh("nether_fossils/fossil_7"),
      new ahh("nether_fossils/fossil_8"),
      new ahh("nether_fossils/fossil_9"),
      new ahh("nether_fossils/fossil_10"),
      new ahh("nether_fossils/fossil_11"),
      new ahh("nether_fossils/fossil_12"),
      new ahh("nether_fossils/fossil_13"),
      new ahh("nether_fossils/fossil_14")
   };

   public static void a(edp $$0, dzt $$1, auw $$2, hx $$3) {
      ddk $$4 = ddk.a($$2);
      $$1.a(new ebv.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dzy {
      public a(edp $$0, ahh $$1, hx $$2, ddk $$3) {
         super(eaf.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(edp $$0, so $$1) {
         super(eaf.ac, $$1, $$0, $$1x -> a(ddk.valueOf($$1.l("Rot"))));
      }

      private static edk a(ddk $$0) {
         return new edk().a($$0).a(dbu.a).a(ecq.d);
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cum $$2, auw $$3, dzg $$4) {
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
