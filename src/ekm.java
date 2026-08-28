public class ekm {
   private static final alb[] a = new alb[]{
      new alb("nether_fossils/fossil_1"),
      new alb("nether_fossils/fossil_2"),
      new alb("nether_fossils/fossil_3"),
      new alb("nether_fossils/fossil_4"),
      new alb("nether_fossils/fossil_5"),
      new alb("nether_fossils/fossil_6"),
      new alb("nether_fossils/fossil_7"),
      new alb("nether_fossils/fossil_8"),
      new alb("nether_fossils/fossil_9"),
      new alb("nether_fossils/fossil_10"),
      new alb("nether_fossils/fossil_11"),
      new alb("nether_fossils/fossil_12"),
      new alb("nether_fossils/fossil_13"),
      new alb("nether_fossils/fossil_14")
   };

   public static void a(emg $$0, eik $$1, azc $$2, iz $$3) {
      dlh $$4 = dlh.a($$2);
      $$1.a(new ekm.a($$0, ac.a(a, $$2), $$3, $$4));
   }

   public static class a extends eip {
      public a(emg $$0, alb $$1, iz $$2, dlh $$3) {
         super(eiw.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(emg $$0, ur $$1) {
         super(eiw.ac, $$1, $$0, $$1x -> a(dlh.valueOf($$1.l("Rot"))));
      }

      private static emb a(dlh $$0) {
         return new emb().a($$0).a(djr.a).a(elh.d);
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dci $$2, azc $$3, ehx $$4) {
      }

      @Override
      public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
