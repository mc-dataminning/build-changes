import java.util.Objects;
import javax.annotation.Nullable;

public record alj(String b, tq c) {
   public static final alj a = a("");

   public static alj a(String $$0) {
      return new alj($$0, tq.c);
   }

   public static alj b(String $$0) {
      return new alj($$0, tq.b);
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

   public tq e() {
      return this.c;
   }
}
