public class euv {
   private static final alr[] a = new alr[]{
      alr.b("nether_fossils/fossil_1"),
      alr.b("nether_fossils/fossil_2"),
      alr.b("nether_fossils/fossil_3"),
      alr.b("nether_fossils/fossil_4"),
      alr.b("nether_fossils/fossil_5"),
      alr.b("nether_fossils/fossil_6"),
      alr.b("nether_fossils/fossil_7"),
      alr.b("nether_fossils/fossil_8"),
      alr.b("nether_fossils/fossil_9"),
      alr.b("nether_fossils/fossil_10"),
      alr.b("nether_fossils/fossil_11"),
      alr.b("nether_fossils/fossil_12"),
      alr.b("nether_fossils/fossil_13"),
      alr.b("nether_fossils/fossil_14")
   };

   public static void a(ewq $$0, ess $$1, bai $$2, iw $$3) {
      dui $$4 = dui.a($$2);
      $$1.a(new euv.a($$0, ag.a(a, $$2), $$3, $$4));
   }

   public static class a extends esx {
      public a(ewq $$0, alr $$1, iw $$2, dui $$3) {
         super(ete.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ewq $$0, ua $$1) {
         super(ete.ac, $$1, $$0, $$1x -> a($$1.<dui>a("Rot", dui.h).orElseThrow()));
      }

      private static ewl a(dui $$0) {
         return new ewl().a($$0).a(dsr.a).a(evq.d);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dui.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
