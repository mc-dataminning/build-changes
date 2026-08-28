import java.util.Objects;
import javax.annotation.Nullable;

public record ata(String b, xz c) {
   public static final ata a = a("");

   public static ata a(String $$0) {
      return new ata($$0, xz.c);
   }

   public static ata b(String $$0) {
      return new ata($$0, xz.b);
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

   public xz e() {
      return this.c;
   }
}
