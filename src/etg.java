import java.util.Objects;
import javax.annotation.Nullable;

public record etg(String a, int b, @Nullable wi c, @Nullable xy d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wi b() {
      return (wi)(this.c != null ? this.c : wi.b(this.c()));
   }

   public ww a(xy $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wi e() {
      return this.c;
   }

   @Nullable
   public xy f() {
      return this.d;
   }
}
