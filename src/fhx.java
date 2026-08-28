import java.io.File;
import java.time.Duration;

public class fhx {
   private static final Duration a = Duration.ofSeconds(15L);

   public static void a(File $$0, long $$1) {
      Thread $$2 = new Thread(() -> {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var4) {
            return;
         }

         o $$3 = aqj.a("Client shutdown", $$1);
         foz.a($$0, $$3);
      });
      $$2.setDaemon(true);
      $$2.setName("Client shutdown watchdog");
      $$2.start();
   }
}
