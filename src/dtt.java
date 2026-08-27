import com.mojang.serialization.Codec;

public enum dtt implements ash {
   a(ha.b, 1, "ceiling"),
   b(ha.a, -1, "floor");

   public static final Codec<dtt> c = ash.a(dtt::values);
   private final ha d;
   private final int e;
   private final String f;

   private dtt(ha $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ha a() {
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
