public class eqs {
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

   public static void a(esn $$0, eop $$1, bam $$2, jh $$3) {
      drc $$4 = drc.a($$2);
      $$1.a(new eqs.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends eou {
      public a(esn $$0, alz $$1, jh $$2, drc $$3) {
         super(epb.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(esn $$0, ux $$1) {
         super(epb.ac, $$1, $$0, $$1x -> a(drc.valueOf($$1.l("Rot"))));
      }

      private static esi a(drc $$0) {
         return new esi().a($$0).a(dpl.a).a(ern.d);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhz $$2, bam $$3, eoc $$4) {
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
