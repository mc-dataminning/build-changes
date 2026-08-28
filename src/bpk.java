public abstract class bpk<R extends Runnable> extends bpg<R> {
   private int b;

   public bpk(String $$0) {
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
