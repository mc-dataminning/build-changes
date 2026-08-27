public class frt extends fpr<bwr> {
   private static final acq a = new acq("textures/entity/illager/vindicator.png");

   public frt(foy.a $$0) {
      super($$0, new fbt<>($$0.a(fed.bK)), 0.5F);
      this.a(new fsz<bwr, fbt<bwr>>(this, $$0.d()) {
         public void a(eij $$0, fjx $$1, int $$2, bwr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public acq a(bwr $$0) {
      return a;
   }
}
