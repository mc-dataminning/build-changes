public abstract class bqe<R extends Runnable> extends bqa<R> {
   private int b;

   public bqe(String $$0) {
      super($$0);
   }

   @Override
   public boolean ax() {
      return this.bD() || super.ax();
   }

   protected boolean bD() {
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
