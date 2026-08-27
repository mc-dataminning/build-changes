import java.util.Objects;
import javax.annotation.Nullable;

public record are(String b, xb c) {
   public static final are a = a("");

   public static are a(String $$0) {
      return new are($$0, xb.c);
   }

   public static are b(String $$0) {
      return new are($$0, xb.b);
   }

   @Nullable
   public String a() {
      return this.c.a(this.b);
   }

   public String b() {
      return Objects.requireNonNullElse(this.a(), "");
   }

   public boolean c() {
      return !this.c.a();
   }

   public String d() {
      return this.b;
   }

   public xb e() {
      return this.c;
   }
}
