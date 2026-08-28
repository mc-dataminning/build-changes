import java.util.Objects;
import javax.annotation.Nullable;

public record ewn(String a, int b, @Nullable xo c, @Nullable ze d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xo b() {
      return (xo)(this.c != null ? this.c : xo.b(this.c()));
   }

   public yc a(ze $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xo e() {
      return this.c;
   }

   @Nullable
   public ze f() {
      return this.d;
   }
}
