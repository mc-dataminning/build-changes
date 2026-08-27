public class fug<T extends cav> extends fuw<T> {
   private static final afw a = new afw("textures/entity/illager/evoker.png");

   public fug(fud.a $$0) {
      super($$0, new fgl<>($$0.a(fiv.V)), 0.5F);
      this.a(new fye<T, fgl<T>>(this, $$0.d()) {
         public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public afw a(T $$0) {
      return a;
   }
}
