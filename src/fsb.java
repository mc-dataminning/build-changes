public abstract class fsb<T extends cah, M extends fhp<T>> extends ftu<T, M> {
   private static final aez a = new aez("textures/entity/zombie/zombie.png");

   protected fsb(ftd.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fxb<>(this, $$2, $$3, $$0.g()));
   }

   public aez a(cah $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}
