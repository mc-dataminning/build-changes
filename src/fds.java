import java.util.Objects;
import javax.annotation.Nullable;

public record fds(String a, int b, @Nullable wv c, @Nullable yl d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wv b() {
      return (wv)(this.c != null ? this.c : wv.b(this.c()));
   }

   public xj a(yl $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wv e() {
      return this.c;
   }

   @Nullable
   public yl f() {
      return this.d;
   }
}
