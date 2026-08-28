public class ekt {
   private static final alf[] a = new alf[]{
      new alf("nether_fossils/fossil_1"),
      new alf("nether_fossils/fossil_2"),
      new alf("nether_fossils/fossil_3"),
      new alf("nether_fossils/fossil_4"),
      new alf("nether_fossils/fossil_5"),
      new alf("nether_fossils/fossil_6"),
      new alf("nether_fossils/fossil_7"),
      new alf("nether_fossils/fossil_8"),
      new alf("nether_fossils/fossil_9"),
      new alf("nether_fossils/fossil_10"),
      new alf("nether_fossils/fossil_11"),
      new alf("nether_fossils/fossil_12"),
      new alf("nether_fossils/fossil_13"),
      new alf("nether_fossils/fossil_14")
   };

   public static void a(emn $$0, eir $$1, azh $$2, iz $$3) {
      dlo $$4 = dlo.a($$2);
      $$1.a(new ekt.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eiw {
      public a(emn $$0, alf $$1, iz $$2, dlo $$3) {
         super(ejd.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emn $$0, us $$1) {
         super(ejd.ac, $$1, $$0, $$1x -> a(dlo.valueOf($$1.l("Rot"))));
      }

      private static emi a(dlo $$0) {
         return new emi().a($$0).a(djy.a).a(elo.d);
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcp $$2, azh $$3, eie $$4) {
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
