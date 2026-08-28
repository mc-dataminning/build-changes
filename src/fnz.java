import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;

public class fnz implements UncaughtExceptionHandler {
   private final Logger a;

   public fnz(Logger $$0) {
      this.a = $$0;
   }

   @Override
   public void uncaughtException(Thread $$0, Throwable $$1) {
      this.a.error("Caught previously unhandled exception", $$1);
   }
}
