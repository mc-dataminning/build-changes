import javax.annotation.Nullable;

public record fhu(int a, xd b, @Nullable xp c, @Nullable fhv d) {
   @Nullable
   public fhv.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xd c() {
      return this.b;
   }

   @Nullable
   public xp d() {
      return this.c;
   }

   @Nullable
   public fhv e() {
      return this.d;
   }

   public static record a(int a, ayo b, @Nullable fhv c, boolean d) {
   }
}
