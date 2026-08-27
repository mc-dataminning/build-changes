import java.util.Objects;
import javax.annotation.Nullable;

public record amh(String b, um c) {
   public static final amh a = a("");

   public static amh a(String $$0) {
      return new amh($$0, um.c);
   }

   public static amh b(String $$0) {
      return new amh($$0, um.b);
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

   public um e() {
      return this.c;
   }
}
