public class alc implements Runnable {
   private final int a;
   private final Runnable b;

   public alc(int $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.a;
   }

   @Override
   public void run() {
      this.b.run();
   }
}
