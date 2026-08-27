import java.util.Locale;

public enum fnv {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fnv(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
