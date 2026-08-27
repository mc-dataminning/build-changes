import java.util.Objects;
import javax.annotation.Nullable;

public record aqk(String b, wk c) {
   public static final aqk a = a("");

   public static aqk a(String $$0) {
      return new aqk($$0, wk.c);
   }

   public static aqk b(String $$0) {
      return new aqk($$0, wk.b);
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

   public wk e() {
      return this.c;
   }
}
