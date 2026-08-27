import java.util.Objects;
import javax.annotation.Nullable;

public record eum(String a, int b, @Nullable wu c, @Nullable yk d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wu b() {
      return (wu)(this.c != null ? this.c : wu.b(this.c()));
   }

   public xi a(yk $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wu e() {
      return this.c;
   }

   @Nullable
   public yk f() {
      return this.d;
   }
}
