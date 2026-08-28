import java.util.Objects;
import javax.annotation.Nullable;

public record arx(String b, xt c) {
   public static final arx a = a("");

   public static arx a(String $$0) {
      return new arx($$0, xt.c);
   }

   public static arx b(String $$0) {
      return new arx($$0, xt.b);
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

   public xt e() {
      return this.c;
   }
}
