import javax.annotation.Nullable;

public record fld(int a, wp b, @Nullable xb c, @Nullable fle d) {
   @Nullable
   public fle.a a() {
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
   public fle e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable fle c, boolean d) {
   }
}
