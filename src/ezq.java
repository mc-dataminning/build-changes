import java.util.Objects;
import javax.annotation.Nullable;

public record ezq(String a, int b, @Nullable xd c, @Nullable yt d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xd b() {
      return (xd)(this.c != null ? this.c : xd.b(this.c()));
   }

   public xr a(yt $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xd e() {
      return this.c;
   }

   @Nullable
   public yt f() {
      return this.d;
   }
}
