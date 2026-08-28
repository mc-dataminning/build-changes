import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class brb extends bqz<Runnable> {
   public brb(Executor $$0, String $$1) {
      super(new brf.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
