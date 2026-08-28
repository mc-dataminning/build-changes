import javax.annotation.Nullable;

public record fgi(int a, wz b, @Nullable xl c, @Nullable fgj d) {
   @Nullable
   public fgj.a a() {
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
   public fgj e() {
      return this.d;
   }

   public static record a(int a, aya b, @Nullable fgj c, boolean d) {
   }
}
