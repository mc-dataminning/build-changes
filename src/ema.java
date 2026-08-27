public class ema {
   private static final akt[] a = new akt[]{
      new akt("nether_fossils/fossil_1"),
      new akt("nether_fossils/fossil_2"),
      new akt("nether_fossils/fossil_3"),
      new akt("nether_fossils/fossil_4"),
      new akt("nether_fossils/fossil_5"),
      new akt("nether_fossils/fossil_6"),
      new akt("nether_fossils/fossil_7"),
      new akt("nether_fossils/fossil_8"),
      new akt("nether_fossils/fossil_9"),
      new akt("nether_fossils/fossil_10"),
      new akt("nether_fossils/fossil_11"),
      new akt("nether_fossils/fossil_12"),
      new akt("nether_fossils/fossil_13"),
      new akt("nether_fossils/fossil_14")
   };

   public static void a(enu $$0, ejy $$1, ayt $$2, ir $$3) {
      dmd $$4 = dmd.a($$2);
      $$1.a(new ema.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends ekd {
      public a(enu $$0, akt $$1, ir $$2, dmd $$3) {
         super(ekk.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(enu $$0, uk $$1) {
         super(ekk.ac, $$1, $$0, $$1x -> a(dmd.valueOf($$1.l("Rot"))));
      }

      private static enp a(dmd $$0) {
         return new enp().a($$0).a(dke.a).a(emv.d);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
