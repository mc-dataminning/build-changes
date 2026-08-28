import java.util.Objects;
import javax.annotation.Nullable;

public record arw(String b, xs c) {
   public static final arw a = a("");

   public static arw a(String $$0) {
      return new arw($$0, xs.c);
   }

   public static arw b(String $$0) {
      return new arw($$0, xs.b);
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

   public xs e() {
      return this.c;
   }
}
