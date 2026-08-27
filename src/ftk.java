public class ftk<T extends bzs> extends fua<T> {
   private static final aex a = new aex("textures/entity/illager/evoker.png");

   public ftk(fth.a $$0) {
      super($$0, new ffr<>($$0.a(fib.V)), 0.5F);
      this.a(new fxi<T, ffr<T>>(this, $$0.d()) {
         public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gn()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aex a(T $$0) {
      return a;
   }
}
