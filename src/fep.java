public abstract class fep<E extends bil> extends fdw<E> {
   private float a = 1.0F;
   private float b = 1.0F;
   private float f = 1.0F;

   public void a(float $$0, float $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.f = $$2;
   }

   @Override
   public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      super.a($$0, $$1, $$2, $$3, this.a * $$4, this.b * $$5, this.f * $$6, $$7);
   }
}
