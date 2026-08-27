import java.util.Locale;

public enum fml {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fml(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
