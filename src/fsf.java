import java.util.Locale;

public enum fsf {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fsf(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
