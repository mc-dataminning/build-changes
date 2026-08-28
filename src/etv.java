public class etv {
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

   public static void a(evq $$0, ers $$1, azv $$2, iv $$3) {
      dtl $$4 = dtl.a($$2);
      $$1.a(new etv.a($$0, ag.a(a, $$2), $$3, $$4));
   }

   public static class a extends erx {
      public a(evq $$0, alg $$1, iv $$2, dtl $$3) {
         super(ese.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(evq $$0, tz $$1) {
         super(ese.ac, $$1, $$0, $$1x -> a($$1.<dtl>a("Rot", dtl.h).orElseThrow()));
      }

      private static evl a(dtl $$0) {
         return new evl().a($$0).a(dru.a).a(euq.d);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtl.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
