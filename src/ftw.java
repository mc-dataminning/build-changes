public class ftw extends ftv<bzb> {
   private static final aeu a = new aeu("textures/entity/illager/illusioner.png");

   public ftw(ftc.a $$0) {
      super($$0, new ffm<>($$0.a(fhw.ao)), 0.5F);
      this.a(new fxd<bzb, ffm<bzb>>(this, $$0.d()) {
         public void a(elk $$0, fnz $$1, int $$2, bzb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gk() || $$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aeu a(bzb $$0) {
      return a;
   }

   public void a(bzb $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      if ($$0.cd()) {
         ehi[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ars.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ars.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ars.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(bzb $$0) {
      return true;
   }
}
