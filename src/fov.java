import java.util.Locale;

public enum fov {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fov(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
