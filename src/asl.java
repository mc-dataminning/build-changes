import java.util.Objects;
import javax.annotation.Nullable;

public record asl(String b, xe c) {
   public static final asl a = a("");

   public static asl a(String $$0) {
      return new asl($$0, xe.c);
   }

   public static asl b(String $$0) {
      return new asl($$0, xe.b);
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

   public xe e() {
      return this.c;
   }
}
