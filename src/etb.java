public class etb {
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

   public static void a(euw $$0, eqy $$1, azv $$2, iu $$3) {
      dst $$4 = dst.a($$2);
      $$1.a(new etb.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends erd {
      public a(euw $$0, alg $$1, iu $$2, dst $$3) {
         super(erk.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(euw $$0, tz $$1) {
         super(erk.ac, $$1, $$0, $$1x -> a(dst.valueOf($$1.l("Rot"))));
      }

      private static eur a(dst $$0) {
         return new eur().a($$0).a(drc.a).a(etw.d);
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iu $$1, djm $$2, azv $$3, eql $$4) {
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
