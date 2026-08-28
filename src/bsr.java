import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bsr extends bsp<Runnable> {
   public bsr(Executor $$0, String $$1) {
      super(new bsv.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
