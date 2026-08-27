import java.util.Objects;
import javax.annotation.Nullable;

public record esx(String a, int b, @Nullable wg c, @Nullable xw d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wg b() {
      return (wg)(this.c != null ? this.c : wg.b(this.c()));
   }

   public wu a(xw $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wg e() {
      return this.c;
   }

   @Nullable
   public xw f() {
      return this.d;
   }
}
