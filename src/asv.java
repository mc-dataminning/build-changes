import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class asv {
   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
   private static final Pattern b = Pattern.compile("\\r\\n|\\v");
   private static final Pattern c = Pattern.compile("(?:\\r\\n|\\v)$");

   public static String a(int $$0) {
      int $$1 = $$0 / 20;
      int $$2 = $$1 / 60;
      $$1 %= 60;
      int $$3 = $$2 / 60;
      $$2 %= 60;
      return $$3 > 0 ? String.format(Locale.ROOT, "%02d:%02d:%02d", $$3, $$2, $$1) : String.format(Locale.ROOT, "%02d:%02d", $$2, $$1);
   }

   public static String a(String $$0) {
      return a.matcher($$0).replaceAll("");
   }

   public static boolean b(@Nullable String $$0) {
      return StringUtils.isEmpty($$0);
   }

   public static String a(String $$0, int $$1, boolean $$2) {
      if ($$0.length() <= $$1) {
         return $$0;
      } else {
         return $$2 && $$1 > 3 ? $$0.substring(0, $$1 - 3) + "..." : $$0.substring(0, $$1);
      }
   }

   public static int c(String $$0) {
      if ($$0.isEmpty()) {
         return 0;
      } else {
         Matcher $$1 = b.matcher($$0);
         int $$2 = 1;

         while ($$1.find()) {
            $$2++;
         }

         return $$2;
      }
   }

   public static boolean d(String $$0) {
      return c.matcher($$0).find();
   }

   public static String e(String $$0) {
      return a($$0, 256, false);
   }
}
