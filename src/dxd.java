public class dxd {
   private static final aeu[] a = new aeu[]{
      new aeu("nether_fossils/fossil_1"),
      new aeu("nether_fossils/fossil_2"),
      new aeu("nether_fossils/fossil_3"),
      new aeu("nether_fossils/fossil_4"),
      new aeu("nether_fossils/fossil_5"),
      new aeu("nether_fossils/fossil_6"),
      new aeu("nether_fossils/fossil_7"),
      new aeu("nether_fossils/fossil_8"),
      new aeu("nether_fossils/fossil_9"),
      new aeu("nether_fossils/fossil_10"),
      new aeu("nether_fossils/fossil_11"),
      new aeu("nether_fossils/fossil_12"),
      new aeu("nether_fossils/fossil_13"),
      new aeu("nether_fossils/fossil_14")
   };

   public static void a(dyx $$0, dvi $$1, arx $$2, gw $$3) {
      czc $$4 = czc.a($$2);
      $$1.a(new dxd.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dvn {
      public a(dyx $$0, aeu $$1, gw $$2, czc $$3) {
         super(dvu.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dyx $$0, qu $$1) {
         super(dvu.ac, $$1, $$0, $$1x -> a(czc.valueOf($$1.l("Rot"))));
      }

      private static dys a(czc $$0) {
         return new dys().a($$0).a(cxl.a).a(dxy.d);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
