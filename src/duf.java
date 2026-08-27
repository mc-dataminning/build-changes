import com.mojang.serialization.Codec;

public enum duf implements asr {
   a(hc.b, 1, "ceiling"),
   b(hc.a, -1, "floor");

   public static final Codec<duf> c = asr.a(duf::values);
   private final hc d;
   private final int e;
   private final String f;

   private duf(hc $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public hc a() {
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
