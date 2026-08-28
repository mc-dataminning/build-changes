import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bqt extends bqr<Runnable> {
   public bqt(Executor $$0, String $$1) {
      super(new bqx.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
