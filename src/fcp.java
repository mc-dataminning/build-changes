import java.util.Objects;
import javax.annotation.Nullable;

public record fcp(String a, int b, @Nullable xk c, @Nullable za d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xk b() {
      return (xk)(this.c != null ? this.c : xk.b(this.c()));
   }

   public xy a(za $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xk e() {
      return this.c;
   }

   @Nullable
   public za f() {
      return this.d;
   }
}
