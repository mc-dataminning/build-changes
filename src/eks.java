public class eks {
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

   public static void a(emm $$0, eiq $$1, azh $$2, iz $$3) {
      dln $$4 = dln.a($$2);
      $$1.a(new eks.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eiv {
      public a(emm $$0, alf $$1, iz $$2, dln $$3) {
         super(ejc.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emm $$0, us $$1) {
         super(ejc.ac, $$1, $$0, $$1x -> a(dln.valueOf($$1.l("Rot"))));
      }

      private static emh a(dln $$0) {
         return new emh().a($$0).a(djx.a).a(eln.d);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dco $$2, azh $$3, eid $$4) {
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
