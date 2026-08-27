import java.util.Objects;
import javax.annotation.Nullable;

public record emz(String a, int b, @Nullable vg c, @Nullable ww d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vg b() {
      return (vg)(this.c != null ? this.c : vg.b(this.c()));
   }

   public vu a(ww $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vg e() {
      return this.c;
   }

   @Nullable
   public ww f() {
      return this.d;
   }
}
