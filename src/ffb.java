import javax.annotation.Nullable;

public record ffb(int a, xp b, @Nullable yb c, @Nullable ffc d) {
   @Nullable
   public ffc.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xp c() {
      return this.b;
   }

   @Nullable
   public yb d() {
      return this.c;
   }

   @Nullable
   public ffc e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable ffc c, boolean d) {
   }
}
