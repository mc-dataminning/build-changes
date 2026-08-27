import java.util.Objects;
import javax.annotation.Nullable;

public record ang(String b, vf c) {
   public static final ang a = a("");

   public static ang a(String $$0) {
      return new ang($$0, vf.c);
   }

   public static ang b(String $$0) {
      return new ang($$0, vf.b);
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

   public vf e() {
      return this.c;
   }
}
