import java.util.Objects;
import javax.annotation.Nullable;

public record asj(String b, xc c) {
   public static final asj a = a("");

   public static asj a(String $$0) {
      return new asj($$0, xc.c);
   }

   public static asj b(String $$0) {
      return new asj($$0, xc.b);
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

   public xc e() {
      return this.c;
   }
}
