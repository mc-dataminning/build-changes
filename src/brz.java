import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class brz extends brx<Runnable> {
   public brz(Executor $$0, String $$1) {
      super(new bsd.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
