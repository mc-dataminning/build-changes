public class epu {
   private static final akv[] a = new akv[]{
      akv.b("nether_fossils/fossil_1"),
      akv.b("nether_fossils/fossil_2"),
      akv.b("nether_fossils/fossil_3"),
      akv.b("nether_fossils/fossil_4"),
      akv.b("nether_fossils/fossil_5"),
      akv.b("nether_fossils/fossil_6"),
      akv.b("nether_fossils/fossil_7"),
      akv.b("nether_fossils/fossil_8"),
      akv.b("nether_fossils/fossil_9"),
      akv.b("nether_fossils/fossil_10"),
      akv.b("nether_fossils/fossil_11"),
      akv.b("nether_fossils/fossil_12"),
      akv.b("nether_fossils/fossil_13"),
      akv.b("nether_fossils/fossil_14")
   };

   public static void a(erp $$0, enr $$1, azh $$2, ji $$3) {
      dqe $$4 = dqe.a($$2);
      $$1.a(new epu.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends enw {
      public a(erp $$0, akv $$1, ji $$2, dqe $$3) {
         super(eod.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(erp $$0, tq $$1) {
         super(eod.ac, $$1, $$0, $$1x -> a(dqe.valueOf($$1.l("Rot"))));
      }

      private static erk a(dqe $$0) {
         return new erk().a($$0).a(dol.a).a(eqp.d);
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
      }

      @Override
      public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
