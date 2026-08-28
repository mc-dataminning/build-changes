import javax.annotation.Nullable;

public record fok(int a, wy b, @Nullable xk c, @Nullable fol d) {
   @Nullable
   public fol.a a() {
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
   public fol e() {
      return this.d;
   }

   public static record a(int a, ayy b, @Nullable fol c, boolean d) {
   }
}
