import javax.annotation.Nullable;

public record flz(int a, wp b, @Nullable xb c, @Nullable fma d) {
   @Nullable
   public fma.a a() {
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
   public fma e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable fma c, boolean d) {
   }
}
