public class ftd extends ftc<byx> {
   private static final aep a = new aep("textures/entity/illager/illusioner.png");

   public ftd(fsj.a $$0) {
      super($$0, new fey<>($$0.a(fhi.ao)), 0.5F);
      this.a(new fwk<byx, fey<byx>>(this, $$0.d()) {
         public void a(elh $$0, fng $$1, int $$2, byx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gj() || $$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aep a(byx $$0) {
      return a;
   }

   public void a(byx $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      if ($$0.cd()) {
         ehf[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)aro.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)aro.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)aro.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(byx $$0) {
      return true;
   }
}
