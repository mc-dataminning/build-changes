public abstract class fsa<T extends bzw, M extends fhp<T>> extends ftt<T, M> {
   private static final aeu a = new aeu("textures/entity/zombie/zombie.png");

   protected fsa(ftc.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new fxa<>(this, $$2, $$3, $$0.g()));
   }

   public aeu a(bzw $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gh();
   }
}
