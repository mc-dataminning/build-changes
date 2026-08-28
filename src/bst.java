import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bst extends bsr<Runnable> {
   public bst(Executor $$0, String $$1) {
      super(new bsx.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
