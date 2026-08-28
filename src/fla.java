import javax.annotation.Nullable;

public record fla(int a, wo b, @Nullable xa c, @Nullable flb d) {
   @Nullable
   public flb.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wo c() {
      return this.b;
   }

   @Nullable
   public xa d() {
      return this.c;
   }

   @Nullable
   public flb e() {
      return this.d;
   }

   public static record a(int a, ayk b, @Nullable flb c, boolean d) {
   }
}
