public abstract class frv<T extends bzt, M extends fhk<T>> extends fto<T, M> {
   private static final aer a = new aer("textures/entity/zombie/zombie.png");

   protected frv(fsx.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fwv<>(this, $$2, $$3, $$0.g()));
   }

   public aer a(bzt $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gh();
   }
}
