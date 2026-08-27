import java.util.Objects;
import javax.annotation.Nullable;

public record eow(String a, int b, @Nullable vq c, @Nullable xg d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vq b() {
      return (vq)(this.c != null ? this.c : vq.b(this.c()));
   }

   public we a(xg $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vq e() {
      return this.c;
   }

   @Nullable
   public xg f() {
      return this.d;
   }
}
