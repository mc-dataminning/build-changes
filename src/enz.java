public class enz {
   private static final alh[] a = new alh[]{
      alh.b("nether_fossils/fossil_1"),
      alh.b("nether_fossils/fossil_2"),
      alh.b("nether_fossils/fossil_3"),
      alh.b("nether_fossils/fossil_4"),
      alh.b("nether_fossils/fossil_5"),
      alh.b("nether_fossils/fossil_6"),
      alh.b("nether_fossils/fossil_7"),
      alh.b("nether_fossils/fossil_8"),
      alh.b("nether_fossils/fossil_9"),
      alh.b("nether_fossils/fossil_10"),
      alh.b("nether_fossils/fossil_11"),
      alh.b("nether_fossils/fossil_12"),
      alh.b("nether_fossils/fossil_13"),
      alh.b("nether_fossils/fossil_14")
   };

   public static void a(epu $$0, elw $$1, azr $$2, jg $$3) {
      dol $$4 = dol.a($$2);
      $$1.a(new enz.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends emb {
      public a(epu $$0, alh $$1, jg $$2, dol $$3) {
         super(emi.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(epu $$0, uj $$1) {
         super(emi.ac, $$1, $$0, $$1x -> a(dol.valueOf($$1.l("Rot"))));
      }

      private static epp a(dol $$0) {
         return new epp().a($$0).a(dmu.a).a(eou.d);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
