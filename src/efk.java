import com.mojang.serialization.Codec;

public enum efk implements ayt {
   a(is.b, 1, "ceiling"),
   b(is.a, -1, "floor");

   public static final Codec<efk> c = ayt.a(efk::values);
   private final is d;
   private final int e;
   private final String f;

   private efk(is $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public is a() {
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
