public class eql {
   private static final alp[] a = new alp[]{
      alp.b("nether_fossils/fossil_1"),
      alp.b("nether_fossils/fossil_2"),
      alp.b("nether_fossils/fossil_3"),
      alp.b("nether_fossils/fossil_4"),
      alp.b("nether_fossils/fossil_5"),
      alp.b("nether_fossils/fossil_6"),
      alp.b("nether_fossils/fossil_7"),
      alp.b("nether_fossils/fossil_8"),
      alp.b("nether_fossils/fossil_9"),
      alp.b("nether_fossils/fossil_10"),
      alp.b("nether_fossils/fossil_11"),
      alp.b("nether_fossils/fossil_12"),
      alp.b("nether_fossils/fossil_13"),
      alp.b("nether_fossils/fossil_14")
   };

   public static void a(esg $$0, eoi $$1, bac $$2, jh $$3) {
      dqv $$4 = dqv.a($$2);
      $$1.a(new eql.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends eon {
      public a(esg $$0, alp $$1, jh $$2, dqv $$3) {
         super(eou.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(esg $$0, um $$1) {
         super(eou.ac, $$1, $$0, $$1x -> a(dqv.valueOf($$1.l("Rot"))));
      }

      private static esb a(dqv $$0) {
         return new esb().a($$0).a(dpc.a).a(erg.d);
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhq $$2, bac $$3, env $$4) {
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
