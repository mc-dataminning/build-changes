public class eoj {
   private static final all[] a = new all[]{
      all.b("nether_fossils/fossil_1"),
      all.b("nether_fossils/fossil_2"),
      all.b("nether_fossils/fossil_3"),
      all.b("nether_fossils/fossil_4"),
      all.b("nether_fossils/fossil_5"),
      all.b("nether_fossils/fossil_6"),
      all.b("nether_fossils/fossil_7"),
      all.b("nether_fossils/fossil_8"),
      all.b("nether_fossils/fossil_9"),
      all.b("nether_fossils/fossil_10"),
      all.b("nether_fossils/fossil_11"),
      all.b("nether_fossils/fossil_12"),
      all.b("nether_fossils/fossil_13"),
      all.b("nether_fossils/fossil_14")
   };

   public static void a(eqe $$0, emg $$1, azv $$2, jh $$3) {
      dow $$4 = dow.a($$2);
      $$1.a(new eoj.a($$0, ae.a(a, $$2), $$3, $$4));
   }

   public static class a extends eml {
      public a(eqe $$0, all $$1, jh $$2, dow $$3) {
         super(ems.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eqe $$0, un $$1) {
         super(ems.ac, $$1, $$0, $$1x -> a(dow.valueOf($$1.l("Rot"))));
      }

      private static epz a(dow $$0) {
         return new epz().a($$0).a(dnf.a).a(epe.d);
      }

      @Override
      protected void a(emr $$0, un $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
      }

      @Override
      public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
