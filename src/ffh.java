import javax.annotation.Nullable;

public record ffh(int a, wu b, @Nullable xg c, @Nullable ffi d) {
   @Nullable
   public ffi.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wu c() {
      return this.b;
   }

   @Nullable
   public xg d() {
      return this.c;
   }

   @Nullable
   public ffi e() {
      return this.d;
   }

   public static record a(int a, axq b, @Nullable ffi c, boolean d) {
   }
}
