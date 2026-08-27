import java.util.Objects;
import javax.annotation.Nullable;

public record aiu(String b, sz c) {
   public static final aiu a = a("");

   public static aiu a(String $$0) {
      return new aiu($$0, sz.c);
   }

   public static aiu b(String $$0) {
      return new aiu($$0, sz.b);
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

   public sz e() {
      return this.c;
   }
}
