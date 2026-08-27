import java.util.Locale;

public enum fmq {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fmq(String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
