import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class brq extends bro<Runnable> {
   public brq(Executor $$0, String $$1) {
      super(new bru.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
