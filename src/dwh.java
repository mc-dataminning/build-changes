import com.mojang.serialization.Codec;

public enum dwh implements auk {
   a(ib.b, 1, "ceiling"),
   b(ib.a, -1, "floor");

   public static final Codec<dwh> c = auk.a(dwh::values);
   private final ib d;
   private final int e;
   private final String f;

   private dwh(ib $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ib a() {
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
