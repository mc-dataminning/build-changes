import java.util.Objects;
import javax.annotation.Nullable;

public record ali(String b, to c) {
   public static final ali a = a("");

   public static ali a(String $$0) {
      return new ali($$0, to.c);
   }

   public static ali b(String $$0) {
      return new ali($$0, to.b);
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

   public to e() {
      return this.c;
   }
}
