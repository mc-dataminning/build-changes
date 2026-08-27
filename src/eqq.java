import java.util.Objects;
import javax.annotation.Nullable;

public record eqq(String a, int b, @Nullable vu c, @Nullable xk d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vu b() {
      return (vu)(this.c != null ? this.c : vu.b(this.c()));
   }

   public wi a(xk $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vu e() {
      return this.c;
   }

   @Nullable
   public xk f() {
      return this.d;
   }
}
