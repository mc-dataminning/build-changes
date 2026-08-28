import javax.annotation.Nullable;

public record fmw(int a, wv b, @Nullable xh c, @Nullable fmx d) {
   @Nullable
   public fmx.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wv c() {
      return this.b;
   }

   @Nullable
   public xh d() {
      return this.c;
   }

   @Nullable
   public fmx e() {
      return this.d;
   }

   public static record a(int a, ayw b, @Nullable fmx c, boolean d) {
   }
}
