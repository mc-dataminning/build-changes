public abstract class brd<R extends Runnable> extends bqz<R> {
   private int b;

   public brd(String $$0) {
      super($$0);
   }

   @Override
   public boolean ax() {
      return this.bB() || super.ax();
   }

   protected boolean bB() {
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
