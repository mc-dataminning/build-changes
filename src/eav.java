public class eav {
   private static final agt[] a = new agt[]{
      new agt("nether_fossils/fossil_1"),
      new agt("nether_fossils/fossil_2"),
      new agt("nether_fossils/fossil_3"),
      new agt("nether_fossils/fossil_4"),
      new agt("nether_fossils/fossil_5"),
      new agt("nether_fossils/fossil_6"),
      new agt("nether_fossils/fossil_7"),
      new agt("nether_fossils/fossil_8"),
      new agt("nether_fossils/fossil_9"),
      new agt("nether_fossils/fossil_10"),
      new agt("nether_fossils/fossil_11"),
      new agt("nether_fossils/fossil_12"),
      new agt("nether_fossils/fossil_13"),
      new agt("nether_fossils/fossil_14")
   };

   public static void a(ecp $$0, dyt $$1, auf $$2, hv $$3) {
      dcl $$4 = dcl.a($$2);
      $$1.a(new eav.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dyy {
      public a(ecp $$0, agt $$1, hv $$2, dcl $$3) {
         super(dzf.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ecp $$0, sj $$1) {
         super(dzf.ac, $$1, $$0, $$1x -> a(dcl.valueOf($$1.l("Rot"))));
      }

      private static eck a(dcl $$0) {
         return new eck().a($$0).a(dav.a).a(ebq.d);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
