import java.util.Objects;
import javax.annotation.Nullable;

public record feu(String a, int b, @Nullable ww c, @Nullable ym d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public ww b() {
      return (ww)(this.c != null ? this.c : ww.b(this.c()));
   }

   public xk a(ym $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public ww e() {
      return this.c;
   }

   @Nullable
   public ym f() {
      return this.d;
   }
}
