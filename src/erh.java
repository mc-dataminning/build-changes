import com.mojang.serialization.Codec;

public enum erh implements bax {
   a(jc.b, 1, "ceiling"),
   b(jc.a, -1, "floor");

   public static final Codec<erh> c = bax.a(erh::values);
   private final jc d;
   private final int e;
   private final String f;

   private erh(final jc $$0, final int $$1, final String $$2) {
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
