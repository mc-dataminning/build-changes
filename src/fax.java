import java.net.Proxy;
import javax.annotation.Nullable;

public class fax {
   @Nullable
   private static Proxy a;

   @Nullable
   public static Proxy a() {
      return a;
   }

   public static void a(Proxy $$0) {
      if (a == null) {
         a = $$0;
      }
   }
}
