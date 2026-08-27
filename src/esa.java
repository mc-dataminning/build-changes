import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;

public class esa implements UncaughtExceptionHandler {
   private final Logger a;

   public esa(Logger $$0) {
      this.a = $$0;
   }

   @Override
   public void uncaughtException(Thread $$0, Throwable $$1) {
      this.a.error("Caught previously unhandled exception", $$1);
   }
}
