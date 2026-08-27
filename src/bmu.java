public abstract class bmu<R extends Runnable> extends bmq<R> {
   private int b;

   public bmu(String $$0) {
      super($$0);
   }

   @Override
   public boolean ay() {
      return this.bA() || super.ay();
   }

   protected boolean bA() {
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
