import java.util.Objects;
import javax.annotation.Nullable;

public record aky(String b, th c) {
   public static final aky a = a("");

   public static aky a(String $$0) {
      return new aky($$0, th.c);
   }

   public static aky b(String $$0) {
      return new aky($$0, th.b);
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

   public th e() {
      return this.c;
   }
}
