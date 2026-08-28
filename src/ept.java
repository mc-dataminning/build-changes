public class ept {
   private static final akv[] a = new akv[]{
      akv.b("nether_fossils/fossil_1"),
      akv.b("nether_fossils/fossil_2"),
      akv.b("nether_fossils/fossil_3"),
      akv.b("nether_fossils/fossil_4"),
      akv.b("nether_fossils/fossil_5"),
      akv.b("nether_fossils/fossil_6"),
      akv.b("nether_fossils/fossil_7"),
      akv.b("nether_fossils/fossil_8"),
      akv.b("nether_fossils/fossil_9"),
      akv.b("nether_fossils/fossil_10"),
      akv.b("nether_fossils/fossil_11"),
      akv.b("nether_fossils/fossil_12"),
      akv.b("nether_fossils/fossil_13"),
      akv.b("nether_fossils/fossil_14")
   };

   public static void a(ero $$0, enq $$1, azh $$2, ji $$3) {
      dqd $$4 = dqd.a($$2);
      $$1.a(new ept.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends env {
      public a(ero $$0, akv $$1, ji $$2, dqd $$3) {
         super(eoc.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ero $$0, tq $$1) {
         super(eoc.ac, $$1, $$0, $$1x -> a(dqd.valueOf($$1.l("Rot"))));
      }

      private static erj a(dqd $$0) {
         return new erj().a($$0).a(dok.a).a(eqo.d);
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgy $$2, azh $$3, end $$4) {
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
