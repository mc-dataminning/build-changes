public class fsm<T extends bzj> extends ftc<T> {
   private static final aep a = new aep("textures/entity/illager/evoker.png");

   public fsm(fsj.a $$0) {
      super($$0, new fey<>($$0.a(fhi.V)), 0.5F);
      this.a(new fwk<T, fey<T>>(this, $$0.d()) {
         public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gj()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aep a(T $$0) {
      return a;
   }
}
