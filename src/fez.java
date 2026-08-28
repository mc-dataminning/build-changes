import javax.annotation.Nullable;

public record fez(int a, xp b, @Nullable yb c, @Nullable ffa d) {
   @Nullable
   public ffa.a a() {
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
   public ffa e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable ffa c, boolean d) {
   }
}
