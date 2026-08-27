public class edl {
   private static final aiy[] a = new aiy[]{
      new aiy("nether_fossils/fossil_1"),
      new aiy("nether_fossils/fossil_2"),
      new aiy("nether_fossils/fossil_3"),
      new aiy("nether_fossils/fossil_4"),
      new aiy("nether_fossils/fossil_5"),
      new aiy("nether_fossils/fossil_6"),
      new aiy("nether_fossils/fossil_7"),
      new aiy("nether_fossils/fossil_8"),
      new aiy("nether_fossils/fossil_9"),
      new aiy("nether_fossils/fossil_10"),
      new aiy("nether_fossils/fossil_11"),
      new aiy("nether_fossils/fossil_12"),
      new aiy("nether_fossils/fossil_13"),
      new aiy("nether_fossils/fossil_14")
   };

   public static void a(eff $$0, ebj $$1, awo $$2, hz $$3) {
      dfa $$4 = dfa.a($$2);
      $$1.a(new edl.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ebo {
      public a(eff $$0, aiy $$1, hz $$2, dfa $$3) {
         super(ebv.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(eff $$0, sw $$1) {
         super(ebv.ac, $$1, $$0, $$1x -> a(dfa.valueOf($$1.l("Rot"))));
      }

      private static efa a(dfa $$0) {
         return new efa().a($$0).a(ddk.a).a(eeg.d);
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
      }

      @Override
      public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
