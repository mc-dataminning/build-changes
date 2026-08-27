import com.mojang.serialization.Codec;

public enum dyb implements avk {
   a(ic.b, 1, "ceiling"),
   b(ic.a, -1, "floor");

   public static final Codec<dyb> c = avk.a(dyb::values);
   private final ic d;
   private final int e;
   private final String f;

   private dyb(ic $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ic a() {
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
