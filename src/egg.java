import com.mojang.serialization.Codec;

public enum egg implements ayz {
   a(it.b, 1, "ceiling"),
   b(it.a, -1, "floor");

   public static final Codec<egg> c = ayz.a(egg::values);
   private final it d;
   private final int e;
   private final String f;

   private egg(it $$0, int $$1, String $$2) {
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
