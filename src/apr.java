import java.util.Objects;
import javax.annotation.Nullable;

public record apr(String b, vw c) {
   public static final apr a = a("");

   public static apr a(String $$0) {
      return new apr($$0, vw.c);
   }

   public static apr b(String $$0) {
      return new apr($$0, vw.b);
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

   public vw e() {
      return this.c;
   }
}
