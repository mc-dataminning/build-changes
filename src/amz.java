import java.util.Objects;
import javax.annotation.Nullable;

public record amz(String b, uz c) {
   public static final amz a = a("");

   public static amz a(String $$0) {
      return new amz($$0, uz.c);
   }

   public static amz b(String $$0) {
      return new amz($$0, uz.b);
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

   public uz e() {
      return this.c;
   }
}
