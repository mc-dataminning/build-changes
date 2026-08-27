import com.mojang.serialization.Codec;

public enum ein implements azg {
   a(iw.b, 1, "ceiling"),
   b(iw.a, -1, "floor");

   public static final Codec<ein> c = azg.a(ein::values);
   private final iw d;
   private final int e;
   private final String f;

   private ein(iw $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public iw a() {
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
