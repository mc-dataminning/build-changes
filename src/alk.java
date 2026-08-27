import java.util.Objects;
import javax.annotation.Nullable;

public record alk(String b, tp c) {
   public static final alk a = a("");

   public static alk a(String $$0) {
      return new alk($$0, tp.c);
   }

   public static alk b(String $$0) {
      return new alk($$0, tp.b);
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

   public tp e() {
      return this.c;
   }
}
