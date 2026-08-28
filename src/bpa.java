public abstract class bpa<R extends Runnable> extends bow<R> {
   private int b;

   public bpa(String $$0) {
      super($$0);
   }

   @Override
   public boolean az() {
      return this.bC() || super.az();
   }

   protected boolean bC() {
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
