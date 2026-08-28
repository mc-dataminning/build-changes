import java.util.Objects;
import javax.annotation.Nullable;

public record asi(String b, xn c) {
   public static final asi a = a("");

   public static asi a(String $$0) {
      return new asi($$0, xn.c);
   }

   public static asi b(String $$0) {
      return new asi($$0, xn.b);
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

   public xn e() {
      return this.c;
   }
}
