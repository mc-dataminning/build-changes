import java.util.Objects;
import javax.annotation.Nullable;

public record apm(String b, vu c) {
   public static final apm a = a("");

   public static apm a(String $$0) {
      return new apm($$0, vu.c);
   }

   public static apm b(String $$0) {
      return new apm($$0, vu.b);
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
