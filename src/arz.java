import java.util.Objects;
import javax.annotation.Nullable;

public record arz(String b, xh c) {
   public static final arz a = a("");

   public static arz a(String $$0) {
      return new arz($$0, xh.c);
   }

   public static arz b(String $$0) {
      return new arz($$0, xh.b);
   }

   @Nullable
   public String a() {
      return this.c.a(this.b);
   }

   public String b() {
      return Objects.requireNonNullElse(this.a(), "");
   }

   public boolean c() {
      return !this.c.a();
   }

   public String d() {
      return this.b;
   }

   public xh e() {
      return this.c;
   }
}
