import java.util.Objects;
import javax.annotation.Nullable;

public record ald(String b, tl c) {
   public static final ald a = a("");

   public static ald a(String $$0) {
      return new ald($$0, tl.c);
   }

   public static ald b(String $$0) {
      return new ald($$0, tl.b);
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

   public tl e() {
      return this.c;
   }
}
