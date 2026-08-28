import javax.annotation.Nullable;

public record fny(int a, ww b, @Nullable xi c, @Nullable fnz d) {
   @Nullable
   public fnz.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public ww c() {
      return this.b;
   }

   @Nullable
   public xi d() {
      return this.c;
   }

   @Nullable
   public fnz e() {
      return this.d;
   }

   public static record a(int a, ayw b, @Nullable fnz c, boolean d) {
   }
}
