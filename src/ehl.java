import com.mojang.serialization.Codec;

public enum ehl implements ayz {
   a(jf.b, 1, "ceiling"),
   b(jf.a, -1, "floor");

   public static final Codec<ehl> c = ayz.a(ehl::values);
   private final jf d;
   private final int e;
   private final String f;

   private ehl(final jf $$0, final int $$1, final String $$2) {
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
