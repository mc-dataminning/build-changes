public class fsz<T extends bfz, M extends fbf<T> & fag> extends ftg<T, M> {
   private final fjt a;

   public fsz(fqt<T, M> $$0, fjt $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fh() == bft.b;
      cfz $$11 = $$10 ? $$3.eP() : $$3.eO();
      cfz $$12 = $$10 ? $$3.eO() : $$3.eP();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cfw.c, bft.b, $$0, $$1, $$2);
         this.a($$3, $$11, cfw.b, bft.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bfz $$0, cfz $$1, cfw $$2, bft $$3, eij $$4, fjx $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bft.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
