import java.util.Objects;
import javax.annotation.Nullable;

public record arc(String b, wy c) {
   public static final arc a = a("");

   public static arc a(String $$0) {
      return new arc($$0, wy.c);
   }

   public static arc b(String $$0) {
      return new arc($$0, wy.b);
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
