import java.util.Objects;
import javax.annotation.Nullable;

public record fbw(String a, int b, @Nullable wo c, @Nullable ye d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wo b() {
      return (wo)(this.c != null ? this.c : wo.b(this.c()));
   }

   public xc a(ye $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wo e() {
      return this.c;
   }

   @Nullable
   public ye f() {
      return this.d;
   }
}
