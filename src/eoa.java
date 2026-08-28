import com.mojang.serialization.Codec;

public enum eoa implements bag {
   a(jo.b, 1, "ceiling"),
   b(jo.a, -1, "floor");

   public static final Codec<eoa> c = bag.a(eoa::values);
   private final jo d;
   private final int e;
   private final String f;

   private eoa(final jo $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jo a() {
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
