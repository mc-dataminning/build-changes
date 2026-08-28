import javax.annotation.Nullable;

public record fgg(int a, wz b, @Nullable xl c, @Nullable fgh d) {
   @Nullable
   public fgh.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wz c() {
      return this.b;
   }

   @Nullable
   public xl d() {
      return this.c;
   }

   @Nullable
   public fgh e() {
      return this.d;
   }

   public static record a(int a, aya b, @Nullable fgh c, boolean d) {
   }
}
