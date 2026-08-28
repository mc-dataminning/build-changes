import javax.annotation.Nullable;

public record fqj(int a, xg b, @Nullable xs c, @Nullable fqk d) {
   @Nullable
   public fqk.a a() {
      return this.d != null ? this.d.f() : null;
   }

   public int b() {
      return this.a;
   }

   public xg c() {
      return this.b;
   }

   @Nullable
   public xs d() {
      return this.c;
   }

   @Nullable
   public fqk e() {
      return this.d;
   }

   public static record a(int a, azk b, @Nullable fqk c, boolean d) {
   }
}
