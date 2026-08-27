import java.util.Objects;
import javax.annotation.Nullable;

public record anu(String b, vj c) {
   public static final anu a = a("");

   public static anu a(String $$0) {
      return new anu($$0, vj.c);
   }

   public static anu b(String $$0) {
      return new anu($$0, vj.b);
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

   public vj e() {
      return this.c;
   }
}
