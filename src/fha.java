import java.util.Objects;
import javax.annotation.Nullable;

public record fha(String a, int b, @Nullable xg c, @Nullable yw d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xg b() {
      return (xg)(this.c != null ? this.c : xg.b(this.c()));
   }

   public xu a(yw $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xg e() {
      return this.c;
   }

   @Nullable
   public yw f() {
      return this.d;
   }
}
