import com.mojang.logging.LogUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

public class bth implements ThreadFactory {
   private static final Logger a = LogUtils.getLogger();
   private final ThreadGroup b;
   private final AtomicInteger c = new AtomicInteger(1);
   private final String d;

   public bth(String $$0) {
      SecurityManager $$1 = System.getSecurityManager();
      this.b = $$1 != null ? $$1.getThreadGroup() : Thread.currentThread().getThreadGroup();
      this.d = $$0 + "-";
   }

   @Override
   public Thread newThread(Runnable $$0) {
      Thread $$1 = new Thread(this.b, $$0, this.d + this.c.getAndIncrement(), 0L);
      $$1.setUncaughtExceptionHandler(($$1x, $$2) -> {
         a.error("Caught exception in thread {} from {}", $$1x, $$0);
         a.error("", $$2);
      });
      if ($$1.getPriority() != 5) {
         $$1.setPriority(5);
      }

      return $$1;
   }
}
