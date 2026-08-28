import java.util.Objects;
import javax.annotation.Nullable;

public record are(String b, wy c) {
   public static final are a = a("");

   public static are a(String $$0) {
      return new are($$0, wy.c);
   }

   public static are b(String $$0) {
      return new are($$0, wy.b);
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

   public wy e() {
      return this.c;
   }
}
