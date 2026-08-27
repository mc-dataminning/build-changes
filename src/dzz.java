import com.mojang.serialization.Codec;

public enum dzz implements axc {
   a(ie.b, 1, "ceiling"),
   b(ie.a, -1, "floor");

   public static final Codec<dzz> c = axc.a(dzz::values);
   private final ie d;
   private final int e;
   private final String f;

   private dzz(ie $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ie a() {
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
