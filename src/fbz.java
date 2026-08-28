import java.util.Objects;
import javax.annotation.Nullable;

public record fbz(String a, int b, @Nullable wp c, @Nullable yf d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wp b() {
      return (wp)(this.c != null ? this.c : wp.b(this.c()));
   }

   public xd a(yf $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wp e() {
      return this.c;
   }

   @Nullable
   public yf f() {
      return this.d;
   }
}
