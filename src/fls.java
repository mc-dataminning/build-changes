import javax.annotation.Nullable;

public record fls(int a, xk b, @Nullable xw c, @Nullable flt d) {
   @Nullable
   public flt.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xk c() {
      return this.b;
   }

   @Nullable
   public xw d() {
      return this.c;
   }

   @Nullable
   public flt e() {
      return this.d;
   }

   public static record a(int a, azg b, @Nullable flt c, boolean d) {
   }
}
