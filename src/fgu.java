import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogListeners;
import org.slf4j.event.Level;

public class fgu {
   private static boolean a;

   public static void a() {
      if (!a) {
         TracyClient.load();
         if (TracyClient.isAvailable()) {
            LogListeners.addListener("Tracy", ($$0, $$1) -> TracyClient.message($$0, a($$1)));
            a = true;
         }
      }
   }

   private static int a(Level $$0) {
      return switch ($$0) {
         case DEBUG -> 11184810;
         case WARN -> 16777130;
         case ERROR -> 16755370;
         default -> 16777215;
      };
   }
}
