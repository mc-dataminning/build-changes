import javax.annotation.Nullable;

public record fdt(int a, wx b, @Nullable xj c, @Nullable fdu d) {
   @Nullable
   public fdu.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public wx c() {
      return this.b;
   }

   @Nullable
   public xj d() {
      return this.c;
   }

   @Nullable
   public fdu e() {
      return this.d;
   }

   public static record a(int a, axq b, @Nullable fdu c, boolean d) {
   }
}
