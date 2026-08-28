public class eoq {
   private static final alj[] a = new alj[]{
      alj.b("nether_fossils/fossil_1"),
      alj.b("nether_fossils/fossil_2"),
      alj.b("nether_fossils/fossil_3"),
      alj.b("nether_fossils/fossil_4"),
      alj.b("nether_fossils/fossil_5"),
      alj.b("nether_fossils/fossil_6"),
      alj.b("nether_fossils/fossil_7"),
      alj.b("nether_fossils/fossil_8"),
      alj.b("nether_fossils/fossil_9"),
      alj.b("nether_fossils/fossil_10"),
      alj.b("nether_fossils/fossil_11"),
      alj.b("nether_fossils/fossil_12"),
      alj.b("nether_fossils/fossil_13"),
      alj.b("nether_fossils/fossil_14")
   };

   public static void a(eql $$0, emn $$1, azu $$2, jh $$3) {
      dpd $$4 = dpd.a($$2);
      $$1.a(new eoq.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends ems {
      public a(eql $$0, alj $$1, jh $$2, dpd $$3) {
         super(emz.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eql $$0, ul $$1) {
         super(emz.ac, $$1, $$0, $$1x -> a(dpd.valueOf($$1.l("Rot"))));
      }

      private static eqg a(dpd $$0) {
         return new eqg().a($$0).a(dnm.a).a(epl.d);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
