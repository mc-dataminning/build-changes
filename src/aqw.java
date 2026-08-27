import java.util.Objects;
import javax.annotation.Nullable;

public record aqw(String b, ww c) {
   public static final aqw a = a("");

   public static aqw a(String $$0) {
      return new aqw($$0, ww.c);
   }

   public static aqw b(String $$0) {
      return new aqw($$0, ww.b);
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

   public ww e() {
      return this.c;
   }
}
