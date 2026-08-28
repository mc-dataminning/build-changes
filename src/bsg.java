import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bsg extends bse<Runnable> {
   public bsg(Executor $$0, String $$1) {
      super(new bsk.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
