import java.util.Objects;
import javax.annotation.Nullable;

public record ffo(String a, int b, @Nullable wy c, @Nullable yo d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wy b() {
      return (wy)(this.c != null ? this.c : wy.b(this.c()));
   }

   public xm a(yo $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wy e() {
      return this.c;
   }

   @Nullable
   public yo f() {
      return this.d;
   }
}
