public class etq {
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

   public static void a(evl $$0, ern $$1, azv $$2, iv $$3) {
      dtg $$4 = dtg.a($$2);
      $$1.a(new etq.a($$0, ag.a(a, $$2), $$3, $$4));
   }

   public static class a extends ers {
      public a(evl $$0, alg $$1, iv $$2, dtg $$3) {
         super(erz.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(evl $$0, tz $$1) {
         super(erz.ac, $$1, $$0, $$1x -> a($$1.<dtg>a("Rot", dtg.h).orElseThrow()));
      }

      private static evg a(dtg $$0) {
         return new evg().a($$0).a(drp.a).a(eul.d);
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtg.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iv $$1, djy $$2, azv $$3, era $$4) {
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
