import javax.annotation.Nullable;

public record fph(int a, wy b, @Nullable xk c, @Nullable fpi d) {
   @Nullable
   public fpi.a a() {
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
   public fpi e() {
      return this.d;
   }

   public static record a(int a, ayy b, @Nullable fpi c, boolean d) {
   }
}
