import java.util.Objects;
import javax.annotation.Nullable;

public record asn(String b, xg c) {
   public static final asn a = a("");

   public static asn a(String $$0) {
      return new asn($$0, xg.c);
   }

   public static asn b(String $$0) {
      return new asn($$0, xg.b);
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

   public xg e() {
      return this.c;
   }
}
