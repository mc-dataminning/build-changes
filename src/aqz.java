import java.util.Objects;
import javax.annotation.Nullable;

public record aqz(String b, wy c) {
   public static final aqz a = a("");

   public static aqz a(String $$0) {
      return new aqz($$0, wy.c);
   }

   public static aqz b(String $$0) {
      return new aqz($$0, wy.b);
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

   public wy e() {
      return this.c;
   }
}
