import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bqx extends bqv<Runnable> {
   public bqx(Executor $$0, String $$1) {
      super(new brb.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
