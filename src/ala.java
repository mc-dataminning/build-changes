import java.util.Objects;
import javax.annotation.Nullable;

public record ala(String b, ti c) {
   public static final ala a = a("");

   public static ala a(String $$0) {
      return new ala($$0, ti.c);
   }

   public static ala b(String $$0) {
      return new ala($$0, ti.b);
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

   public ti e() {
      return this.c;
   }
}
