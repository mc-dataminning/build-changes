import java.util.Objects;
import javax.annotation.Nullable;

public record fal(String a, int b, @Nullable xi c, @Nullable yy d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xi b() {
      return (xi)(this.c != null ? this.c : xi.b(this.c()));
   }

   public xw a(yy $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xi e() {
      return this.c;
   }

   @Nullable
   public yy f() {
      return this.d;
   }
}
