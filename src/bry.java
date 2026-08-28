import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bry extends brw<Runnable> {
   public bry(Executor $$0, String $$1) {
      super(new bsc.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
