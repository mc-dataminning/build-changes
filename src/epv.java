import com.mojang.serialization.Codec;

public enum epv implements bak {
   a(ja.b, 1, "ceiling"),
   b(ja.a, -1, "floor");

   public static final Codec<epv> c = bak.a(epv::values);
   private final ja d;
   private final int e;
   private final String f;

   private epv(final ja $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ja a() {
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
