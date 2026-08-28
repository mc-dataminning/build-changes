import java.util.Objects;
import javax.annotation.Nullable;

public record fgq(String a, int b, @Nullable xc c, @Nullable ys d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xc b() {
      return (xc)(this.c != null ? this.c : xc.b(this.c()));
   }

   public xq a(ys $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xc e() {
      return this.c;
   }

   @Nullable
   public ys f() {
      return this.d;
   }
}
