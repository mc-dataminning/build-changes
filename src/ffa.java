import javax.annotation.Nullable;

public record ffa(int a, xp b, @Nullable yb c, @Nullable ffb d) {
   @Nullable
   public ffb.a a() {
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
   public ffb e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable ffb c, boolean d) {
   }
}
