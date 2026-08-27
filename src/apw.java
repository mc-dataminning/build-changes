import java.util.Objects;
import javax.annotation.Nullable;

public record apw(String b, vy c) {
   public static final apw a = a("");

   public static apw a(String $$0) {
      return new apw($$0, vy.c);
   }

   public static apw b(String $$0) {
      return new apw($$0, vy.b);
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

   public vy e() {
      return this.c;
   }
}
