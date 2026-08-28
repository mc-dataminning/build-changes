import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class btg extends bte<Runnable> {
   public btg(Executor $$0, String $$1) {
      super(new btl.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
