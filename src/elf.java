public class elf {
   private static final akk[] a = new akk[]{
      new akk("nether_fossils/fossil_1"),
      new akk("nether_fossils/fossil_2"),
      new akk("nether_fossils/fossil_3"),
      new akk("nether_fossils/fossil_4"),
      new akk("nether_fossils/fossil_5"),
      new akk("nether_fossils/fossil_6"),
      new akk("nether_fossils/fossil_7"),
      new akk("nether_fossils/fossil_8"),
      new akk("nether_fossils/fossil_9"),
      new akk("nether_fossils/fossil_10"),
      new akk("nether_fossils/fossil_11"),
      new akk("nether_fossils/fossil_12"),
      new akk("nether_fossils/fossil_13"),
      new akk("nether_fossils/fossil_14")
   };

   public static void a(emz $$0, ejc $$1, ayo $$2, ja $$3) {
      dlv $$4 = dlv.a($$2);
      $$1.a(new elf.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends ejh {
      public a(emz $$0, akk $$1, ja $$2, dlv $$3) {
         super(ejo.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emz $$0, tx $$1) {
         super(ejo.ac, $$1, $$0, $$1x -> a(dlv.valueOf($$1.l("Rot"))));
      }

      private static emu a(dlv $$0) {
         return new emu().a($$0).a(dkf.a).a(ema.d);
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ja $$1, dcv $$2, ayo $$3, eip $$4) {
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
