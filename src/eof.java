public class eof {
   private static final ali[] a = new ali[]{
      ali.b("nether_fossils/fossil_1"),
      ali.b("nether_fossils/fossil_2"),
      ali.b("nether_fossils/fossil_3"),
      ali.b("nether_fossils/fossil_4"),
      ali.b("nether_fossils/fossil_5"),
      ali.b("nether_fossils/fossil_6"),
      ali.b("nether_fossils/fossil_7"),
      ali.b("nether_fossils/fossil_8"),
      ali.b("nether_fossils/fossil_9"),
      ali.b("nether_fossils/fossil_10"),
      ali.b("nether_fossils/fossil_11"),
      ali.b("nether_fossils/fossil_12"),
      ali.b("nether_fossils/fossil_13"),
      ali.b("nether_fossils/fossil_14")
   };

   public static void a(eqa $$0, emc $$1, azs $$2, jh $$3) {
      dor $$4 = dor.a($$2);
      $$1.a(new eof.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends emh {
      public a(eqa $$0, ali $$1, jh $$2, dor $$3) {
         super(emo.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eqa $$0, uk $$1) {
         super(emo.ac, $$1, $$0, $$1x -> a(dor.valueOf($$1.l("Rot"))));
      }

      private static epv a(dor $$0) {
         return new epv().a($$0).a(dna.a).a(epa.d);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
