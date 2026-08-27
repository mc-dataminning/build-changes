import java.util.Objects;
import javax.annotation.Nullable;

public record emj(String a, int b, @Nullable vd c, @Nullable wt d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vd b() {
      return (vd)(this.c != null ? this.c : vd.b(this.c()));
   }

   public vr a(wt $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vd e() {
      return this.c;
   }

   @Nullable
   public wt f() {
      return this.d;
   }
}
