import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class aza {
   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
   private static final Pattern b = Pattern.compile("\\r\\n|\\v");
   private static final Pattern c = Pattern.compile("(?:\\r\\n|\\v)$");

   public static String a(int $$0, float $$1) {
      int $$2 = aye.d((float)$$0 / $$1);
      int $$3 = $$2 / 60;
      $$2 %= 60;
      int $$4 = $$3 / 60;
      $$3 %= 60;
      return $$4 > 0 ? String.format(Locale.ROOT, "%02d:%02d:%02d", $$4, $$3, $$2) : String.format(Locale.ROOT, "%02d:%02d", $$3, $$2);
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

   public static boolean a(char $$0) {
      return $$0 != 167 && $$0 >= ' ' && $$0 != 127;
   }

   public static boolean f(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public static String g(String $$0) {
      return a($$0, false);
   }

   public static String a(String $$0, boolean $$1) {
      StringBuilder $$2 = new StringBuilder();

      for (char $$3 : $$0.toCharArray()) {
         if (a($$3)) {
            $$2.append($$3);
         } else if ($$1 && $$3 == '\n') {
            $$2.append($$3);
         }
      }

      return $$2.toString();
   }

   public static boolean a(int $$0) {
      return Character.isWhitespace($$0) || Character.isSpaceChar($$0);
   }

   public static boolean h(@Nullable String $$0) {
      return $$0 != null && $$0.length() != 0 ? $$0.chars().allMatch(aza::a) : true;
   }
}
