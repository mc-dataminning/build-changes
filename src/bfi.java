public abstract class bfi<R extends Runnable> extends bfe<R> {
   private int b;

   public bfi(String $$0) {
      super($$0);
   }

   @Override
   public boolean at() {
      return this.bs() || super.at();
   }

   protected boolean bs() {
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
