import java.util.Objects;
import javax.annotation.Nullable;

public record apn(String b, vu c) {
   public static final apn a = a("");

   public static apn a(String $$0) {
      return new apn($$0, vu.c);
   }

   public static apn b(String $$0) {
      return new apn($$0, vu.b);
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

   public vu e() {
      return this.c;
   }
}
