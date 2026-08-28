public class eqk {
   private static final alz[] a = new alz[]{
      alz.b("nether_fossils/fossil_1"),
      alz.b("nether_fossils/fossil_2"),
      alz.b("nether_fossils/fossil_3"),
      alz.b("nether_fossils/fossil_4"),
      alz.b("nether_fossils/fossil_5"),
      alz.b("nether_fossils/fossil_6"),
      alz.b("nether_fossils/fossil_7"),
      alz.b("nether_fossils/fossil_8"),
      alz.b("nether_fossils/fossil_9"),
      alz.b("nether_fossils/fossil_10"),
      alz.b("nether_fossils/fossil_11"),
      alz.b("nether_fossils/fossil_12"),
      alz.b("nether_fossils/fossil_13"),
      alz.b("nether_fossils/fossil_14")
   };

   public static void a(esf $$0, eoh $$1, bam $$2, jh $$3) {
      dqu $$4 = dqu.a($$2);
      $$1.a(new eqk.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends eom {
      public a(esf $$0, alz $$1, jh $$2, dqu $$3) {
         super(eot.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(esf $$0, ux $$1) {
         super(eot.ac, $$1, $$0, $$1x -> a(dqu.valueOf($$1.l("Rot"))));
      }

      private static esa a(dqu $$0) {
         return new esa().a($$0).a(dpd.a).a(erf.d);
      }

      @Override
      protected void a(eos $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhr $$2, bam $$3, enu $$4) {
      }

      @Override
      public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
