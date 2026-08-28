import javax.annotation.Nullable;

public record flc(int a, wo b, @Nullable xa c, @Nullable fld d) {
   @Nullable
   public fld.a a() {
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
   public fld e() {
      return this.d;
   }

   public static record a(int a, ayl b, @Nullable fld c, boolean d) {
   }
}
