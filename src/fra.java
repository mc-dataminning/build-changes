import java.util.Locale;

public enum fra {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fra(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
