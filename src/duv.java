import com.mojang.serialization.Codec;

public enum duv implements atr {
   a(hx.b, 1, "ceiling"),
   b(hx.a, -1, "floor");

   public static final Codec<duv> c = atr.a(duv::values);
   private final hx d;
   private final int e;
   private final String f;

   private duv(hx $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public hx a() {
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
