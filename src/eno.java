public class eno {
   private static final ale[] a = new ale[]{
      ale.b("nether_fossils/fossil_1"),
      ale.b("nether_fossils/fossil_2"),
      ale.b("nether_fossils/fossil_3"),
      ale.b("nether_fossils/fossil_4"),
      ale.b("nether_fossils/fossil_5"),
      ale.b("nether_fossils/fossil_6"),
      ale.b("nether_fossils/fossil_7"),
      ale.b("nether_fossils/fossil_8"),
      ale.b("nether_fossils/fossil_9"),
      ale.b("nether_fossils/fossil_10"),
      ale.b("nether_fossils/fossil_11"),
      ale.b("nether_fossils/fossil_12"),
      ale.b("nether_fossils/fossil_13"),
      ale.b("nether_fossils/fossil_14")
   };

   public static void a(epj $$0, ell $$1, azn $$2, jf $$3) {
      doa $$4 = doa.a($$2);
      $$1.a(new eno.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends elq {
      public a(epj $$0, ale $$1, jf $$2, doa $$3) {
         super(elx.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(epj $$0, ug $$1) {
         super(elx.ac, $$1, $$0, $$1x -> a(doa.valueOf($$1.l("Rot"))));
      }

      private static epe a(doa $$0) {
         return new epe().a($$0).a(dmj.a).a(eoj.d);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
