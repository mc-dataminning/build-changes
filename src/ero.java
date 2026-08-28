public class ero {
   private static final ald[] a = new ald[]{
      ald.b("nether_fossils/fossil_1"),
      ald.b("nether_fossils/fossil_2"),
      ald.b("nether_fossils/fossil_3"),
      ald.b("nether_fossils/fossil_4"),
      ald.b("nether_fossils/fossil_5"),
      ald.b("nether_fossils/fossil_6"),
      ald.b("nether_fossils/fossil_7"),
      ald.b("nether_fossils/fossil_8"),
      ald.b("nether_fossils/fossil_9"),
      ald.b("nether_fossils/fossil_10"),
      ald.b("nether_fossils/fossil_11"),
      ald.b("nether_fossils/fossil_12"),
      ald.b("nether_fossils/fossil_13"),
      ald.b("nether_fossils/fossil_14")
   };

   public static void a(etj $$0, epl $$1, azs $$2, jj $$3) {
      drm $$4 = drm.a($$2);
      $$1.a(new ero.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends epq {
      public a(etj $$0, ald $$1, jj $$2, drm $$3) {
         super(epx.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(etj $$0, tw $$1) {
         super(epx.ac, $$1, $$0, $$1x -> a(drm.valueOf($$1.l("Rot"))));
      }

      private static ete a(drm $$0) {
         return new ete().a($$0).a(dpv.a).a(esj.d);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
