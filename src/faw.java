import java.util.Objects;
import javax.annotation.Nullable;

public record faw(String a, int b, @Nullable xj c, @Nullable yz d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public xj b() {
      return (xj)(this.c != null ? this.c : xj.b(this.c()));
   }

   public xx a(yz $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public xj e() {
      return this.c;
   }

   @Nullable
   public yz f() {
      return this.d;
   }
}
