public abstract class cqw<I extends cym, R extends cyj<I>> extends cpi {
   public cqw(cqq<?> $$0, int $$1) {
      super($$0, $$1);
   }

   public void a(boolean $$0, cyl<?> $$1, aqn $$2) {
      cyl<R> $$3 = (cyl<R>)$$1;
      this.aj_();

      try {
         new ajy<>(this).a($$2, $$3, $$0);
      } finally {
         this.b((cyl<R>)$$1);
      }
   }

   protected void aj_() {
   }

   protected void b(cyl<R> $$0) {
   }

   public abstract void a(cmp var1);

   @Override
   public abstract void l();

   public abstract boolean a(cyl<R> var1);

   public abstract int m();

   public abstract int n();

   public abstract int o();

   public abstract int p();

   public abstract cqx t();

   public abstract boolean e(int var1);
}
