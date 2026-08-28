import javax.annotation.Nullable;

public record flb(int a, wp b, @Nullable xb c, @Nullable flc d) {
   @Nullable
   public flc.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wp c() {
      return this.b;
   }

   @Nullable
   public xb d() {
      return this.c;
   }

   @Nullable
   public flc e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable flc c, boolean d) {
   }
}
