public class eqr {
   private static final aku[] a = new aku[]{
      aku.b("nether_fossils/fossil_1"),
      aku.b("nether_fossils/fossil_2"),
      aku.b("nether_fossils/fossil_3"),
      aku.b("nether_fossils/fossil_4"),
      aku.b("nether_fossils/fossil_5"),
      aku.b("nether_fossils/fossil_6"),
      aku.b("nether_fossils/fossil_7"),
      aku.b("nether_fossils/fossil_8"),
      aku.b("nether_fossils/fossil_9"),
      aku.b("nether_fossils/fossil_10"),
      aku.b("nether_fossils/fossil_11"),
      aku.b("nether_fossils/fossil_12"),
      aku.b("nether_fossils/fossil_13"),
      aku.b("nether_fossils/fossil_14")
   };

   public static void a(esm $$0, eoo $$1, azh $$2, ji $$3) {
      dqw $$4 = dqw.a($$2);
      $$1.a(new eqr.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends eot {
      public a(esm $$0, aku $$1, ji $$2, dqw $$3) {
         super(epa.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(esm $$0, tq $$1) {
         super(epa.ac, $$1, $$0, $$1x -> a(dqw.valueOf($$1.l("Rot"))));
      }

      private static esh a(dqw $$0) {
         return new esh().a($$0).a(dpf.a).a(erm.d);
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dhq $$2, azh $$3, eob $$4) {
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
