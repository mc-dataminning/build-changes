public abstract class bhr<R extends Runnable> extends bhn<R> {
   private int b;

   public bhr(String $$0) {
      super($$0);
   }

   @Override
   public boolean av() {
      return this.bw() || super.av();
   }

   protected boolean bw() {
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
