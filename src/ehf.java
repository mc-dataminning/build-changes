import com.mojang.serialization.Codec;

public enum ehf implements azu {
   a(je.b, 1, "ceiling"),
   b(je.a, -1, "floor");

   public static final Codec<ehf> c = azu.a(ehf::values);
   private final je d;
   private final int e;
   private final String f;

   private ehf(final je $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public je a() {
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
