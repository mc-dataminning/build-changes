public class esq {
   private static final ale[] a = new ale[]{
      ale.b("nether_fossils/fossil_1"),
      ale.b("nether_fossils/fossil_2"),
      ale.b("nether_fossils/fossil_3"),
      ale.b("nether_fossils/fossil_4"),
      ale.b("nether_fossils/fossil_5"),
      ale.b("nether_fossils/fossil_6"),
      ale.b("nether_fossils/fossil_7"),
      ale.b("nether_fossils/fossil_8"),
      ale.b("nether_fossils/fossil_9"),
      ale.b("nether_fossils/fossil_10"),
      ale.b("nether_fossils/fossil_11"),
      ale.b("nether_fossils/fossil_12"),
      ale.b("nether_fossils/fossil_13"),
      ale.b("nether_fossils/fossil_14")
   };

   public static void a(eul $$0, eqn $$1, azt $$2, iu $$3) {
      dsm $$4 = dsm.a($$2);
      $$1.a(new esq.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends eqs {
      public a(eul $$0, ale $$1, iu $$2, dsm $$3) {
         super(eqz.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eul $$0, tx $$1) {
         super(eqz.ac, $$1, $$0, $$1x -> a(dsm.valueOf($$1.l("Rot"))));
      }

      private static eug a(dsm $$0) {
         return new eug().a($$0).a(dqv.a).a(etl.d);
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
      }

      @Override
      public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
