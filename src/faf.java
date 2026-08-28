import java.util.Objects;
import javax.annotation.Nullable;

public record faf(String a, int b, @Nullable xh c, @Nullable yx d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xh b() {
      return (xh)(this.c != null ? this.c : xh.b(this.c()));
   }

   public xv a(yx $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xh e() {
      return this.c;
   }

   @Nullable
   public yx f() {
      return this.d;
   }
}
