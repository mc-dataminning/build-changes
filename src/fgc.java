import javax.annotation.Nullable;

public record fgc(int a, wy b, @Nullable xk c, @Nullable fgd d) {
   @Nullable
   public fgd.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wy c() {
      return this.b;
   }

   @Nullable
   public xk d() {
      return this.c;
   }

   @Nullable
   public fgd e() {
      return this.d;
   }

   public static record a(int a, axz b, @Nullable fgd c, boolean d) {
   }
}
