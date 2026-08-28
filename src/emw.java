public class emw {
   private static final alb[] a = new alb[]{
      alb.b("nether_fossils/fossil_1"),
      alb.b("nether_fossils/fossil_2"),
      alb.b("nether_fossils/fossil_3"),
      alb.b("nether_fossils/fossil_4"),
      alb.b("nether_fossils/fossil_5"),
      alb.b("nether_fossils/fossil_6"),
      alb.b("nether_fossils/fossil_7"),
      alb.b("nether_fossils/fossil_8"),
      alb.b("nether_fossils/fossil_9"),
      alb.b("nether_fossils/fossil_10"),
      alb.b("nether_fossils/fossil_11"),
      alb.b("nether_fossils/fossil_12"),
      alb.b("nether_fossils/fossil_13"),
      alb.b("nether_fossils/fossil_14")
   };

   public static void a(eor $$0, ekt $$1, azk $$2, je $$3) {
      dnj $$4 = dnj.a($$2);
      $$1.a(new emw.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends eky {
      public a(eor $$0, alb $$1, je $$2, dnj $$3) {
         super(elf.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eor $$0, uf $$1) {
         super(elf.ac, $$1, $$0, $$1x -> a(dnj.valueOf($$1.l("Rot"))));
      }

      private static eom a(dnj $$0) {
         return new eom().a($$0).a(dls.a).a(enr.d);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, je $$1, dei $$2, azk $$3, ekg $$4) {
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
