import java.util.Objects;
import javax.annotation.Nullable;

public record eps(String a, int b, @Nullable vs c, @Nullable xi d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vs b() {
      return (vs)(this.c != null ? this.c : vs.b(this.c()));
   }

   public wg a(xi $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vs e() {
      return this.c;
   }

   @Nullable
   public xi f() {
      return this.d;
   }
}
