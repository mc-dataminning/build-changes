public abstract class bpl<R extends Runnable> extends bph<R> {
   private int b;

   public bpl(String $$0) {
      super($$0);
   }

   @Override
   public boolean ay() {
      return this.bC() || super.ay();
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
