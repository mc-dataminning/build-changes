public abstract class cri<I extends czc, R extends cyz<I>> extends cpu {
   public cri(crc<?> $$0, int $$1) {
      super($$0, $$1);
   }

   public void a(boolean $$0, czb<?> $$1, aqv $$2) {
      czb<R> $$3 = (czb<R>)$$1;
      this.an_();

      try {
         new akf<>(this).a($$2, $$3, $$0);
      } finally {
         this.b((czb<R>)$$1);
      }
   }

   protected void an_() {
   }

   protected void b(czb<R> $$0) {
   }

   public abstract void a(cnb var1);

   @Override
   public abstract void l();

   public abstract boolean a(czb<R> var1);

   public abstract int m();

   public abstract int n();

   public abstract int o();

   public abstract int p();

   public abstract crj t();

   public abstract boolean e(int var1);
}
