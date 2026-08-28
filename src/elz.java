public class elz {
   private static final akr[] a = new akr[]{
      akr.b("nether_fossils/fossil_1"),
      akr.b("nether_fossils/fossil_2"),
      akr.b("nether_fossils/fossil_3"),
      akr.b("nether_fossils/fossil_4"),
      akr.b("nether_fossils/fossil_5"),
      akr.b("nether_fossils/fossil_6"),
      akr.b("nether_fossils/fossil_7"),
      akr.b("nether_fossils/fossil_8"),
      akr.b("nether_fossils/fossil_9"),
      akr.b("nether_fossils/fossil_10"),
      akr.b("nether_fossils/fossil_11"),
      akr.b("nether_fossils/fossil_12"),
      akr.b("nether_fossils/fossil_13"),
      akr.b("nether_fossils/fossil_14")
   };

   public static void a(enu $$0, ejw $$1, ayw $$2, jd $$3) {
      dmm $$4 = dmm.a($$2);
      $$1.a(new elz.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends ekb {
      public a(enu $$0, akr $$1, jd $$2, dmm $$3) {
         super(eki.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(enu $$0, ub $$1) {
         super(eki.ac, $$1, $$0, $$1x -> a(dmm.valueOf($$1.l("Rot"))));
      }

      private static enp a(dmm $$0) {
         return new enp().a($$0).a(dkv.a).a(emu.d);
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
