import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bti extends btg<Runnable> {
   public bti(Executor $$0, String $$1) {
      super(new btn.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
