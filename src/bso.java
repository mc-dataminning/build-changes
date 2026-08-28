import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bso extends bsm<Runnable> {
   public bso(Executor $$0, String $$1) {
      super(new bss.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
