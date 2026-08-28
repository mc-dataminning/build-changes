import java.util.Objects;
import javax.annotation.Nullable;

public record asu(String b, xk c) {
   public static final asu a = a("");

   public static asu a(String $$0) {
      return new asu($$0, xk.c);
   }

   public static asu b(String $$0) {
      return new asu($$0, xk.b);
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

   public xk e() {
      return this.c;
   }
}
