import java.util.Objects;
import javax.annotation.Nullable;

public record asg(String b, xm c) {
   public static final asg a = a("");

   public static asg a(String $$0) {
      return new asg($$0, xm.c);
   }

   public static asg b(String $$0) {
      return new asg($$0, xm.b);
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

   public xm e() {
      return this.c;
   }
}
