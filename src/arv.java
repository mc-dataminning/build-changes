import java.util.Objects;
import javax.annotation.Nullable;

public record arv(String b, ws c) {
   public static final arv a = a("");

   public static arv a(String $$0) {
      return new arv($$0, ws.c);
   }

   public static arv b(String $$0) {
      return new arv($$0, ws.b);
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

   public ws e() {
      return this.c;
   }
}
