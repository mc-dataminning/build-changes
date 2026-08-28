import javax.annotation.Nullable;

public record fjb(int a, xi b, @Nullable xu c, @Nullable fjc d) {
   @Nullable
   public fjc.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xi c() {
      return this.b;
   }

   @Nullable
   public xu d() {
      return this.c;
   }

   @Nullable
   public fjc e() {
      return this.d;
   }

   public static record a(int a, ayw b, @Nullable fjc c, boolean d) {
   }
}
