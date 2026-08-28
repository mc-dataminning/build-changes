import com.mojang.serialization.Codec;

public enum ehr implements azc {
   a(jf.b, 1, "ceiling"),
   b(jf.a, -1, "floor");

   public static final Codec<ehr> c = azc.a(ehr::values);
   private final jf d;
   private final int e;
   private final String f;

   private ehr(final jf $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jf a() {
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
