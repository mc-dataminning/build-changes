import javax.annotation.Nullable;

public record fos(int a, wy b, @Nullable xk c, @Nullable fot d) {
   @Nullable
   public fot.a a() {
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
   public fot e() {
      return this.d;
   }

   public static record a(int a, ayy b, @Nullable fot c, boolean d) {
   }
}
