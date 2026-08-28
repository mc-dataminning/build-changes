public abstract class bsw<R extends Runnable> extends bss<R> {
   private int b;

   public bsw(String $$0) {
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
