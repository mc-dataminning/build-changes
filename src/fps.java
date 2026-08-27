public class fps extends fpr<bwa> {
   private static final acq a = new acq("textures/entity/illager/illusioner.png");

   public fps(foy.a $$0) {
      super($$0, new fbt<>($$0.a(fed.ao)), 0.5F);
      this.a(new fsz<bwa, fbt<bwa>>(this, $$0.d()) {
         public void a(eij $$0, fjx $$1, int $$2, bwa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gi() || $$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public acq a(bwa $$0) {
      return a;
   }

   public void a(bwa $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      if ($$0.cb()) {
         eei[] $$6 = $$0.D($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)apa.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)apa.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)apa.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(bwa $$0) {
      return true;
   }
}
