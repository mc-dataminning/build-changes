import java.util.Objects;
import javax.annotation.Nullable;

public record asf(String b, xl c) {
   public static final asf a = a("");

   public static asf a(String $$0) {
      return new asf($$0, xl.c);
   }

   public static asf b(String $$0) {
      return new asf($$0, xl.b);
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

   public xl e() {
      return this.c;
   }
}
