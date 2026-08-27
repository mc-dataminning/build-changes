import java.util.Objects;
import javax.annotation.Nullable;

public record evh(String a, int b, @Nullable wx c, @Nullable yn d) {
   public boolean a() {
      return this.a.startsWith("#");
   }

   public wx b() {
      return (wx)(this.c != null ? this.c : wx.b(this.c()));
   }

   public xl a(yn $$0) {
      return Objects.requireNonNullElse(this.d, $$0).a(this.b);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public wx e() {
      return this.c;
   }

   @Nullable
   public yn f() {
      return this.d;
   }
}
