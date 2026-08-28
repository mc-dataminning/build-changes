public class eps {
   private static final aku[] a = new aku[]{
      aku.b("nether_fossils/fossil_1"),
      aku.b("nether_fossils/fossil_2"),
      aku.b("nether_fossils/fossil_3"),
      aku.b("nether_fossils/fossil_4"),
      aku.b("nether_fossils/fossil_5"),
      aku.b("nether_fossils/fossil_6"),
      aku.b("nether_fossils/fossil_7"),
      aku.b("nether_fossils/fossil_8"),
      aku.b("nether_fossils/fossil_9"),
      aku.b("nether_fossils/fossil_10"),
      aku.b("nether_fossils/fossil_11"),
      aku.b("nether_fossils/fossil_12"),
      aku.b("nether_fossils/fossil_13"),
      aku.b("nether_fossils/fossil_14")
   };

   public static void a(ern $$0, enp $$1, azg $$2, ji $$3) {
      dqc $$4 = dqc.a($$2);
      $$1.a(new eps.a($$0, af.a(a, $$2), $$3, $$4));
   }

   public static class a extends enu {
      public a(ern $$0, aku $$1, ji $$2, dqc $$3) {
         super(eob.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ern $$0, tq $$1) {
         super(eob.ac, $$1, $$0, $$1x -> a(dqc.valueOf($$1.l("Rot"))));
      }

      private static eri a(dqc $$0) {
         return new eri().a($$0).a(doj.a).a(eqn.d);
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
      }

      @Override
      public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
