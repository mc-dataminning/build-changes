public class dzc {
   private static final agg[] a = new agg[]{
      new agg("nether_fossils/fossil_1"),
      new agg("nether_fossils/fossil_2"),
      new agg("nether_fossils/fossil_3"),
      new agg("nether_fossils/fossil_4"),
      new agg("nether_fossils/fossil_5"),
      new agg("nether_fossils/fossil_6"),
      new agg("nether_fossils/fossil_7"),
      new agg("nether_fossils/fossil_8"),
      new agg("nether_fossils/fossil_9"),
      new agg("nether_fossils/fossil_10"),
      new agg("nether_fossils/fossil_11"),
      new agg("nether_fossils/fossil_12"),
      new agg("nether_fossils/fossil_13"),
      new agg("nether_fossils/fossil_14")
   };

   public static void a(eaw $$0, dxa $$1, ato $$2, ht $$3) {
      dbf $$4 = dbf.a($$2);
      $$1.a(new dzc.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dxf {
      public a(eaw $$0, agg $$1, ht $$2, dbf $$3) {
         super(dxm.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eaw $$0, rz $$1) {
         super(dxm.ac, $$1, $$0, $$1x -> a(dbf.valueOf($$1.l("Rot"))));
      }

      private static ear a(dbf $$0) {
         return new ear().a($$0).a(czp.a).a(dzx.d);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
