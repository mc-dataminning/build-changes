import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bqy extends bqw<Runnable> {
   public bqy(Executor $$0, String $$1) {
      super(new brc.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
