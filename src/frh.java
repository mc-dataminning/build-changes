public abstract class frh<T extends bzs, M extends fhb<T>> extends fta<T, M> {
   private static final aep a = new aep("textures/entity/zombie/zombie.png");

   protected frh(fsj.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fwh<>(this, $$2, $$3, $$0.g()));
   }

   public aep a(bzs $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gg();
   }
}
