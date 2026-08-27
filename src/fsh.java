public abstract class fsh<T extends cad, M extends fhw<T>> extends fua<T, M> {
   private static final aey a = new aey("textures/entity/zombie/zombie.png");

   protected fsh(ftj.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fxh<>(this, $$2, $$3, $$0.g()));
   }

   public aey a(cad $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gk();
   }
}
