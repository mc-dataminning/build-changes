public class enk {
   private static final alc[] a = new alc[]{
      alc.b("nether_fossils/fossil_1"),
      alc.b("nether_fossils/fossil_2"),
      alc.b("nether_fossils/fossil_3"),
      alc.b("nether_fossils/fossil_4"),
      alc.b("nether_fossils/fossil_5"),
      alc.b("nether_fossils/fossil_6"),
      alc.b("nether_fossils/fossil_7"),
      alc.b("nether_fossils/fossil_8"),
      alc.b("nether_fossils/fossil_9"),
      alc.b("nether_fossils/fossil_10"),
      alc.b("nether_fossils/fossil_11"),
      alc.b("nether_fossils/fossil_12"),
      alc.b("nether_fossils/fossil_13"),
      alc.b("nether_fossils/fossil_14")
   };

   public static void a(epf $$0, elh $$1, azl $$2, je $$3) {
      dnx $$4 = dnx.a($$2);
      $$1.a(new enk.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends elm {
      public a(epf $$0, alc $$1, je $$2, dnx $$3) {
         super(elt.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(epf $$0, uf $$1) {
         super(elt.ac, $$1, $$0, $$1x -> a(dnx.valueOf($$1.l("Rot"))));
      }

      private static epa a(dnx $$0) {
         return new epa().a($$0).a(dmg.a).a(eof.d);
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
