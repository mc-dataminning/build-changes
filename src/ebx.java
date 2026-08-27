import com.mojang.serialization.Codec;

public enum ebx implements axq {
   a(ih.b, 1, "ceiling"),
   b(ih.a, -1, "floor");

   public static final Codec<ebx> c = axq.a(ebx::values);
   private final ih d;
   private final int e;
   private final String f;

   private ebx(ih $$0, int $$1, String $$2) {
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
