import java.util.Objects;
import javax.annotation.Nullable;

public record ezu(String a, int b, @Nullable xe c, @Nullable yu d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xe b() {
      return (xe)(this.c != null ? this.c : xe.b(this.c()));
   }

   public xs a(yu $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xe e() {
      return this.c;
   }

   @Nullable
   public yu f() {
      return this.d;
   }
}
