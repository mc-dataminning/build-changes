import javax.annotation.Nullable;

public record fqy(int a, xc b, @Nullable xo c, @Nullable fqz d) {
   @Nullable
   public fqz.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xc c() {
      return this.b;
   }

   @Nullable
   public xo d() {
      return this.c;
   }

   @Nullable
   public fqz e() {
      return this.d;
   }

   public static record a(int a, azc b, @Nullable fqz c, boolean d) {
   }
}
