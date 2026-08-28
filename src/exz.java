import java.util.Objects;
import javax.annotation.Nullable;

public record exz(String a, int b, @Nullable wz c, @Nullable yp d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wz b() {
      return (wz)(this.c != null ? this.c : wz.b(this.c()));
   }

   public xn a(yp $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wz e() {
      return this.c;
   }

   @Nullable
   public yp f() {
      return this.d;
   }
}
