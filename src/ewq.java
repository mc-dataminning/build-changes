import java.util.Objects;
import javax.annotation.Nullable;

public record ewq(String a, int b, @Nullable xp c, @Nullable zf d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xp b() {
      return (xp)(this.c != null ? this.c : xp.b(this.c()));
   }

   public yd a(zf $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xp e() {
      return this.c;
   }

   @Nullable
   public zf f() {
      return this.d;
   }
}
