import java.util.Objects;
import javax.annotation.Nullable;

public record aqm(String b, wm c) {
   public static final aqm a = a("");

   public static aqm a(String $$0) {
      return new aqm($$0, wm.c);
   }

   public static aqm b(String $$0) {
      return new aqm($$0, wm.b);
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

   public wm e() {
      return this.c;
   }
}
