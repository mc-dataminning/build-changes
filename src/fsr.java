public abstract class fsr<T extends bfj & bgm, M extends fbf<T>> extends ftg<T, M> {
   public fsr(fqt<T, M> $$0) {
      super($$0);
   }

   @Override
   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.a()) {
         float $$10 = (float)$$3.ag + $$6;
         fbf<T> $$11 = this.b();
         $$11.a($$3, $$4, $$5, $$6);
         this.c().a($$11);
         ein $$12 = $$1.getBuffer(fkf.a(this.a(), this.a($$10) % 1.0F, $$10 * 0.01F % 1.0F));
         $$11.a($$3, $$4, $$5, $$7, $$8, $$9);
         $$11.a($$0, $$12, $$2, fum.d, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract float a(float var1);

   protected abstract acq a();

   protected abstract fbf<T> b();
}
