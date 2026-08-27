public class dua {
   private static final acq[] a = new acq[]{
      new acq("nether_fossils/fossil_1"),
      new acq("nether_fossils/fossil_2"),
      new acq("nether_fossils/fossil_3"),
      new acq("nether_fossils/fossil_4"),
      new acq("nether_fossils/fossil_5"),
      new acq("nether_fossils/fossil_6"),
      new acq("nether_fossils/fossil_7"),
      new acq("nether_fossils/fossil_8"),
      new acq("nether_fossils/fossil_9"),
      new acq("nether_fossils/fossil_10"),
      new acq("nether_fossils/fossil_11"),
      new acq("nether_fossils/fossil_12"),
      new acq("nether_fossils/fossil_13"),
      new acq("nether_fossils/fossil_14")
   };

   public static void a(dvu $$0, dsf $$1, apf $$2, gu $$3) {
      cvz $$4 = cvz.a($$2);
      $$1.a(new dua.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dsk {
      public a(dvu $$0, acq $$1, gu $$2, cvz $$3) {
         super(dsr.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dvu $$0, qr $$1) {
         super(dsr.ac, $$1, $$0, $$1x -> a(cvz.valueOf($$1.l("Rot"))));
      }

      private static dvp a(cvz $$0) {
         return new dvp().a($$0).a(cui.a).a(duv.d);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
