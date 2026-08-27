public class dya {
   private static final afw[] a = new afw[]{
      new afw("nether_fossils/fossil_1"),
      new afw("nether_fossils/fossil_2"),
      new afw("nether_fossils/fossil_3"),
      new afw("nether_fossils/fossil_4"),
      new afw("nether_fossils/fossil_5"),
      new afw("nether_fossils/fossil_6"),
      new afw("nether_fossils/fossil_7"),
      new afw("nether_fossils/fossil_8"),
      new afw("nether_fossils/fossil_9"),
      new afw("nether_fossils/fossil_10"),
      new afw("nether_fossils/fossil_11"),
      new afw("nether_fossils/fossil_12"),
      new afw("nether_fossils/fossil_13"),
      new afw("nether_fossils/fossil_14")
   };

   public static void a(dzu $$0, dwf $$1, ate $$2, ht $$3) {
      dal $$4 = dal.a($$2);
      $$1.a(new dya.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends dwk {
      public a(dzu $$0, afw $$1, ht $$2, dal $$3) {
         super(dwr.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(dzu $$0, rt $$1) {
         super(dwr.ac, $$1, $$0, $$1x -> a(dal.valueOf($$1.l("Rot"))));
      }

      private static dzp a(dal $$0) {
         return new dzp().a($$0).a(cyv.a).a(dyv.d);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
