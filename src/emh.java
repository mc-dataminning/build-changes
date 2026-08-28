import com.mojang.serialization.Codec;

public enum emh implements azv {
   a(jn.b, 1, "ceiling"),
   b(jn.a, -1, "floor");

   public static final Codec<emh> c = azv.a(emh::values);
   private final jn d;
   private final int e;
   private final String f;

   private emh(final jn $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jn a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   @Override
   public String c() {
      return this.f;
   }
}
