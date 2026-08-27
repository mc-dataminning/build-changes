public abstract class bif<R extends Runnable> extends bib<R> {
   private int b;

   public bif(String $$0) {
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
