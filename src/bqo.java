import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bqo extends bqm<Runnable> {
   public bqo(Executor $$0, String $$1) {
      super(new bqs.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
