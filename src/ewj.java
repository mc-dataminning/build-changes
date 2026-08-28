import java.util.Objects;
import javax.annotation.Nullable;

public record ewj(String a, int b, @Nullable xl c, @Nullable zb d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xl b() {
      return (xl)(this.c != null ? this.c : xl.b(this.c()));
   }

   public xz a(zb $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xl e() {
      return this.c;
   }

   @Nullable
   public zb f() {
      return this.d;
   }
}
