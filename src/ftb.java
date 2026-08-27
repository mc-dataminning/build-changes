public abstract class ftb<T extends cbe, M extends fio<T>> extends fuu<T, M> {
   private static final afw a = new afw("textures/entity/zombie/zombie.png");

   protected ftb(fud.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fyb<>(this, $$2, $$3, $$0.g()));
   }

   public afw a(cbe $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gl();
   }
}
