public abstract class frm<T extends bzu, M extends fhf<T>> extends ftf<T, M> {
   private static final aer a = new aer("textures/entity/zombie/zombie.png");

   protected frm(fso.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fwm<>(this, $$2, $$3, $$0.g()));
   }

   public aer a(bzu $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gg();
   }
}
