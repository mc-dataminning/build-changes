import javax.annotation.Nullable;

public record fqw(int a, xa b, @Nullable xm c, @Nullable fqx d) {
   @Nullable
   public fqx.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xa c() {
      return this.b;
   }

   @Nullable
   public xm d() {
      return this.c;
   }

   @Nullable
   public fqx e() {
      return this.d;
   }

   public static record a(int a, aza b, @Nullable fqx c, boolean d) {
   }
}
