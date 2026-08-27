import com.mojang.serialization.Codec;

public enum ege implements ayx {
   a(it.b, 1, "ceiling"),
   b(it.a, -1, "floor");

   public static final Codec<ege> c = ayx.a(ege::values);
   private final it d;
   private final int e;
   private final String f;

   private ege(it $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public it a() {
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
