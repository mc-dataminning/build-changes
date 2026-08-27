import com.mojang.serialization.Codec;

public enum ebb implements axg {
   a(ih.b, 1, "ceiling"),
   b(ih.a, -1, "floor");

   public static final Codec<ebb> c = axg.a(ebb::values);
   private final ih d;
   private final int e;
   private final String f;

   private ebb(ih $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ih a() {
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
