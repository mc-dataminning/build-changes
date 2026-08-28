import java.util.Objects;
import javax.annotation.Nullable;

public record arm(String b, xd c) {
   public static final arm a = a("");

   public static arm a(String $$0) {
      return new arm($$0, xd.c);
   }

   public static arm b(String $$0) {
      return new arm($$0, xd.b);
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

   public xd e() {
      return this.c;
   }
}
