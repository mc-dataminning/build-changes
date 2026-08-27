public class fsu extends ftg<btm, fbq<btm>> {
   private final fbq<btm> a;

   public fsu(fqt<btm, fbq<btm>> $$0, fea $$1) {
      super($$0);
      this.a = new fbq<>($$1.a(fed.ak));
   }

   public void a(eij $$0, fjx $$1, int $$2, btm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfz $$10 = $$3.q();
      if ($$10.d() instanceof cfp) {
         cfp $$11 = (cfp)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof ceq) {
            int $$12 = ((ceq)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         ein $$19 = $$1.getBuffer(fkf.d($$11.h()));
         this.a.a($$0, $$19, $$2, fum.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
