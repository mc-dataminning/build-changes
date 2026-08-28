import java.util.Objects;
import javax.annotation.Nullable;

public record ash(String b, xa c) {
   public static final ash a = a("");

   public static ash a(String $$0) {
      return new ash($$0, xa.c);
   }

   public static ash b(String $$0) {
      return new ash($$0, xa.b);
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

   public xa e() {
      return this.c;
   }
}
