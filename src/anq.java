import java.util.Objects;
import javax.annotation.Nullable;

public record anq(String b, vh c) {
   public static final anq a = a("");

   public static anq a(String $$0) {
      return new anq($$0, vh.c);
   }

   public static anq b(String $$0) {
      return new anq($$0, vh.b);
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

   public vh e() {
      return this.c;
   }
}
