import java.util.Locale;

public enum fth {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fth(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
