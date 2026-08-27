import java.util.Objects;
import javax.annotation.Nullable;

public record euc(String a, int b, @Nullable ws c, @Nullable yi d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public ws b() {
      return (ws)(this.c != null ? this.c : ws.b(this.c()));
   }

   public xg a(yi $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public ws e() {
      return this.c;
   }

   @Nullable
   public yi f() {
      return this.d;
   }
}
