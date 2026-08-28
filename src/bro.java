import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class bro extends brm<Runnable> {
   public bro(Executor $$0, String $$1) {
      super(new brs.b(new ConcurrentLinkedQueue<>()), $$0, $$1);
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }
}
