import java.util.Objects;
import javax.annotation.Nullable;

public record asb(String b, xi c) {
   public static final asb a = a("");

   public static asb a(String $$0) {
      return new asb($$0, xi.c);
   }

   public static asb b(String $$0) {
      return new asb($$0, xi.b);
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

   public xi e() {
      return this.c;
   }
}
