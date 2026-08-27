import java.util.Objects;
import javax.annotation.Nullable;

public record arf(String b, xb c) {
   public static final arf a = a("");

   public static arf a(String $$0) {
      return new arf($$0, xb.c);
   }

   public static arf b(String $$0) {
      return new arf($$0, xb.b);
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

   public xb e() {
      return this.c;
   }
}
