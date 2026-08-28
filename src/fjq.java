import javax.annotation.Nullable;

public record fjq(int a, xl b, @Nullable xx c, @Nullable fjr d) {
   @Nullable
   public fjr.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xl c() {
      return this.b;
   }

   @Nullable
   public xx d() {
      return this.c;
   }

   @Nullable
   public fjr e() {
      return this.d;
   }

   public static record a(int a, ayz b, @Nullable fjr c, boolean d) {
   }
}
