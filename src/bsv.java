import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bsv extends bst<Runnable> {
   public bsv(Executor $$0, String $$1) {
      super(new bta.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
