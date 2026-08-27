public abstract class bhk<R extends Runnable> extends bhg<R> {
   private int b;

   public bhk(String $$0) {
      super($$0);
   }

   @Override
   public boolean at() {
      return this.br() || super.at();
   }

   protected boolean br() {
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
