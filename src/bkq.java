public abstract class bkq<R extends Runnable> extends bkm<R> {
   private int b;

   public bkq(String $$0) {
      super($$0);
   }

   @Override
   public boolean ax() {
      return this.by() || super.ax();
   }

   protected boolean by() {
      return this.b != 0;
   }

   @Override
   public void d(R $$0) {
      this.b++;

      try {
         super.d($$0);
      } finally {
         this.b--;
      }
   }
}
