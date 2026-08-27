public class fpb<T extends bwm> extends fpr<T> {
   private static final acq a = new acq("textures/entity/illager/evoker.png");

   public fpb(foy.a $$0) {
      super($$0, new fbt<>($$0.a(fed.V)), 0.5F);
      this.a(new fsz<T, fbt<T>>(this, $$0.d()) {
         public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gi()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public acq a(T $$0) {
      return a;
   }
}
