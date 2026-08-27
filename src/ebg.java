public class ebg {
   private static final ahd[] a = new ahd[]{
      new ahd("nether_fossils/fossil_1"),
      new ahd("nether_fossils/fossil_2"),
      new ahd("nether_fossils/fossil_3"),
      new ahd("nether_fossils/fossil_4"),
      new ahd("nether_fossils/fossil_5"),
      new ahd("nether_fossils/fossil_6"),
      new ahd("nether_fossils/fossil_7"),
      new ahd("nether_fossils/fossil_8"),
      new ahd("nether_fossils/fossil_9"),
      new ahd("nether_fossils/fossil_10"),
      new ahd("nether_fossils/fossil_11"),
      new ahd("nether_fossils/fossil_12"),
      new ahd("nether_fossils/fossil_13"),
      new ahd("nether_fossils/fossil_14")
   };

   public static void a(eda $$0, dze $$1, aup $$2, hx $$3) {
      dcv $$4 = dcv.a($$2);
      $$1.a(new ebg.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dzj {
      public a(eda $$0, ahd $$1, hx $$2, dcv $$3) {
         super(dzq.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eda $$0, sl $$1) {
         super(dzq.ac, $$1, $$0, $$1x -> a(dcv.valueOf($$1.l("Rot"))));
      }

      private static ecv a(dcv $$0) {
         return new ecv().a($$0).a(dbf.a).a(ecb.d);
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
      }

      @Override
      public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
