import java.util.Objects;
import javax.annotation.Nullable;

public record art(String b, xp c) {
   public static final art a = a("");

   public static art a(String $$0) {
      return new art($$0, xp.c);
   }

   public static art b(String $$0) {
      return new art($$0, xp.b);
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

   public xp e() {
      return this.c;
   }
}
