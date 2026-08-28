public class epv {
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

   public static void a(erq $$0, ens $$1, azh $$2, ji $$3) {
      dqf $$4 = dqf.a($$2);
      $$1.a(new epv.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends enx {
      public a(erq $$0, akv $$1, ji $$2, dqf $$3) {
         super(eoe.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(erq $$0, tq $$1) {
         super(eoe.ac, $$1, $$0, $$1x -> a(dqf.valueOf($$1.l("Rot"))));
      }

      private static erl a(dqf $$0) {
         return new erl().a($$0).a(dom.a).a(eqq.d);
      }

      @Override
      protected void a(eod $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dha $$2, azh $$3, enf $$4) {
      }

      @Override
      public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
