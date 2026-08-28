import javax.annotation.Nullable;

public record fjx(int a, xj b, @Nullable xv c, @Nullable fjy d) {
   @Nullable
   public fjy.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xj c() {
      return this.b;
   }

   @Nullable
   public xv d() {
      return this.c;
   }

   @Nullable
   public fjy e() {
      return this.d;
   }

   public static record a(int a, ayy b, @Nullable fjy c, boolean d) {
   }
}
