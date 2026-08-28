import java.util.Objects;
import javax.annotation.Nullable;

public record fgo(String a, int b, @Nullable xa c, @Nullable yq d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xa b() {
      return (xa)(this.c != null ? this.c : xa.b(this.c()));
   }

   public xo a(yq $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xa e() {
      return this.c;
   }

   @Nullable
   public yq f() {
      return this.d;
   }
}
