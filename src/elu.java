public class elu {
   private static final akq[] a = new akq[]{
      akq.b("nether_fossils/fossil_1"),
      akq.b("nether_fossils/fossil_2"),
      akq.b("nether_fossils/fossil_3"),
      akq.b("nether_fossils/fossil_4"),
      akq.b("nether_fossils/fossil_5"),
      akq.b("nether_fossils/fossil_6"),
      akq.b("nether_fossils/fossil_7"),
      akq.b("nether_fossils/fossil_8"),
      akq.b("nether_fossils/fossil_9"),
      akq.b("nether_fossils/fossil_10"),
      akq.b("nether_fossils/fossil_11"),
      akq.b("nether_fossils/fossil_12"),
      akq.b("nether_fossils/fossil_13"),
      akq.b("nether_fossils/fossil_14")
   };

   public static void a(eno $$0, ejr $$1, ayv $$2, jd $$3) {
      dmk $$4 = dmk.a($$2);
      $$1.a(new elu.a($$0, ad.a(a, $$2), $$3, $$4));
   }

   public static class a extends ejw {
      public a(eno $$0, akq $$1, jd $$2, dmk $$3) {
         super(ekd.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eno $$0, ua $$1) {
         super(ekd.ac, $$1, $$0, $$1x -> a(dmk.valueOf($$1.l("Rot"))));
      }

      private static enj a(dmk $$0) {
         return new enj().a($$0).a(dkt.a).a(emp.d);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
