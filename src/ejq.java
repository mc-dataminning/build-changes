public class ejq {
   private static final akm[] a = new akm[]{
      new akm("nether_fossils/fossil_1"),
      new akm("nether_fossils/fossil_2"),
      new akm("nether_fossils/fossil_3"),
      new akm("nether_fossils/fossil_4"),
      new akm("nether_fossils/fossil_5"),
      new akm("nether_fossils/fossil_6"),
      new akm("nether_fossils/fossil_7"),
      new akm("nether_fossils/fossil_8"),
      new akm("nether_fossils/fossil_9"),
      new akm("nether_fossils/fossil_10"),
      new akm("nether_fossils/fossil_11"),
      new akm("nether_fossils/fossil_12"),
      new akm("nether_fossils/fossil_13"),
      new akm("nether_fossils/fossil_14")
   };

   public static void a(elk $$0, eho $$1, ayk $$2, io $$3) {
      dkl $$4 = dkl.a($$2);
      $$1.a(new ejq.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eht {
      public a(elk $$0, akm $$1, io $$2, dkl $$3) {
         super(eia.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(elk $$0, ud $$1) {
         super(eia.ac, $$1, $$0, $$1x -> a(dkl.valueOf($$1.l("Rot"))));
      }

      private static elf a(dkl $$0) {
         return new elf().a($$0).a(div.a).a(ekl.d);
      }

      @Override
      protected void a(ehz $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, io $$1, dbm $$2, ayk $$3, ehb $$4) {
      }

      @Override
      public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
