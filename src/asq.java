import java.util.Objects;
import javax.annotation.Nullable;

public record asq(String b, xo c) {
   public static final asq a = a("");

   public static asq a(String $$0) {
      return new asq($$0, xo.c);
   }

   public static asq b(String $$0) {
      return new asq($$0, xo.b);
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

   public xo e() {
      return this.c;
   }
}
