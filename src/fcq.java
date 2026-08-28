import java.util.Objects;
import javax.annotation.Nullable;

public record fcq(String a, int b, @Nullable xv c, @Nullable zl d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xv b() {
      return (xv)(this.c != null ? this.c : xv.b(this.c()));
   }

   public yj a(zl $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xv e() {
      return this.c;
   }

   @Nullable
   public zl f() {
      return this.d;
   }
}
