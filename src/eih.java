import com.mojang.serialization.Codec;

public enum eih implements azj {
   a(ji.b, 1, "ceiling"),
   b(ji.a, -1, "floor");

   public static final Codec<eih> c = azj.a(eih::values);
   private final ji d;
   private final int e;
   private final String f;

   private eih(final ji $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ji a() {
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
