import com.mojang.serialization.Codec;

public enum dts implements asf {
   a(hb.b, 1, "ceiling"),
   b(hb.a, -1, "floor");

   public static final Codec<dts> c = asf.a(dts::values);
   private final hb d;
   private final int e;
   private final String f;

   private dts(hb $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public hb a() {
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
