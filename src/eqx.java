import com.mojang.serialization.Codec;

public enum eqx implements bao {
   a(jc.b, 1, "ceiling"),
   b(jc.a, -1, "floor");

   public static final Codec<eqx> c = bao.a(eqx::values);
   private final jc d;
   private final int e;
   private final String f;

   private eqx(final jc $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jc a() {
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
