import java.util.Objects;
import javax.annotation.Nullable;

public record emq(String a, int b, @Nullable vf c, @Nullable wv d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public vf b() {
      return (vf)(this.c != null ? this.c : vf.b(this.c()));
   }

   public vt a(wv $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public vf e() {
      return this.c;
   }

   @Nullable
   public wv f() {
      return this.d;
   }
}
