public class eqr {
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

   public static void a(esm $$0, eoo $$1, bam $$2, jh $$3) {
      drb $$4 = drb.a($$2);
      $$1.a(new eqr.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends eot {
      public a(esm $$0, alz $$1, jh $$2, drb $$3) {
         super(epa.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(esm $$0, ux $$1) {
         super(epa.ac, $$1, $$0, $$1x -> a(drb.valueOf($$1.l("Rot"))));
      }

      private static esh a(drb $$0) {
         return new esh().a($$0).a(dpk.a).a(erm.d);
      }

      @Override
      protected void a(eoz $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhy $$2, bam $$3, eob $$4) {
      }

      @Override
      public void a(dif $$0, did $$1, dzq $$2, bam $$3, eob $$4, dgn $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
