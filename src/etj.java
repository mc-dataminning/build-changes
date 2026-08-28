public class etj {
   private static final alg[] a = new alg[]{
      alg.b("nether_fossils/fossil_1"),
      alg.b("nether_fossils/fossil_2"),
      alg.b("nether_fossils/fossil_3"),
      alg.b("nether_fossils/fossil_4"),
      alg.b("nether_fossils/fossil_5"),
      alg.b("nether_fossils/fossil_6"),
      alg.b("nether_fossils/fossil_7"),
      alg.b("nether_fossils/fossil_8"),
      alg.b("nether_fossils/fossil_9"),
      alg.b("nether_fossils/fossil_10"),
      alg.b("nether_fossils/fossil_11"),
      alg.b("nether_fossils/fossil_12"),
      alg.b("nether_fossils/fossil_13"),
      alg.b("nether_fossils/fossil_14")
   };

   public static void a(eve $$0, erg $$1, azv $$2, iu $$3) {
      dsz $$4 = dsz.a($$2);
      $$1.a(new etj.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends erl {
      public a(eve $$0, alg $$1, iu $$2, dsz $$3) {
         super(ers.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eve $$0, tz $$1) {
         super(ers.ac, $$1, $$0, $$1x -> a(dsz.valueOf($$1.l("Rot"))));
      }

      private static euz a(dsz $$0) {
         return new euz().a($$0).a(dri.a).a(eue.d);
      }

      @Override
      protected void a(err $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iu $$1, djr $$2, azv $$3, eqt $$4) {
      }

      @Override
      public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
