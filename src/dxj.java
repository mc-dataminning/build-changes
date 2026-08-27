import com.mojang.serialization.Codec;

public enum dxj implements aut {
   a(ia.b, 1, "ceiling"),
   b(ia.a, -1, "floor");

   public static final Codec<dxj> c = aut.a(dxj::values);
   private final ia d;
   private final int e;
   private final String f;

   private dxj(ia $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ia a() {
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
