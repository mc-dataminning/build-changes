import java.util.Objects;
import javax.annotation.Nullable;

public record amv(String b, uv c) {
   public static final amv a = a("");

   public static amv a(String $$0) {
      return new amv($$0, uv.c);
   }

   public static amv b(String $$0) {
      return new amv($$0, uv.b);
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

   public uv e() {
      return this.c;
   }
}
