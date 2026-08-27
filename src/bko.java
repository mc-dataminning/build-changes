public abstract class bko<R extends Runnable> extends bkk<R> {
   private int b;

   public bko(String $$0) {
      super($$0);
   }

   @Override
   public boolean av() {
      return this.bx() || super.av();
   }

   protected boolean bx() {
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
