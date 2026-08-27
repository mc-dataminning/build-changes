public class ftf<T extends bzn> extends ftv<T> {
   private static final aeu a = new aeu("textures/entity/illager/evoker.png");

   public ftf(ftc.a $$0) {
      super($$0, new ffm<>($$0.a(fhw.V)), 0.5F);
      this.a(new fxd<T, ffm<T>>(this, $$0.d()) {
         public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gk()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aeu a(T $$0) {
      return a;
   }
}
