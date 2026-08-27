import java.util.Locale;

public enum emt {
   a,
   b,
   c,
   d;

   private static final int e = 1024;

   public static emt a(long $$0) {
      if ($$0 < 1024L) {
         return a;
      } else {
         try {
            int $$1 = (int)(Math.log((double)$$0) / Math.log(1024.0));
            String $$2 = String.valueOf("KMGTPE".charAt($$1 - 1));
            return valueOf($$2 + "B");
         } catch (Exception var4) {
            return d;
         }
      }
   }

   public static double a(long $$0, emt $$1) {
      return $$1 == a ? (double)$$0 : (double)$$0 / Math.pow(1024.0, (double)$$1.ordinal());
   }

   public static String b(long $$0) {
      int $$1 = 1024;
      if ($$0 < 1024L) {
         return $$0 + " B";
      } else {
         int $$2 = (int)(Math.log((double)$$0) / Math.log(1024.0));
         String $$3 = "KMGTPE".charAt($$2 - 1) + "";
         return String.format(Locale.ROOT, "%.1f %sB", (double)$$0 / Math.pow(1024.0, (double)$$2), $$3);
      }
   }

   public static String b(long $$0, emt $$1) {
      return String.format(Locale.ROOT, "%." + ($$1 == d ? "1" : "0") + "f %s", a($$0, $$1), $$1.name());
   }
}
