import java.util.Objects;
import javax.annotation.Nullable;

public record anv(String b, vk c) {
   public static final anv a = a("");

   public static anv a(String $$0) {
      return new anv($$0, vk.c);
   }

   public static anv b(String $$0) {
      return new anv($$0, vk.b);
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

   public vk e() {
      return this.c;
   }
}
