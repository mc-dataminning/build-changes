import java.util.Locale;

public enum fkt {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fkt(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
