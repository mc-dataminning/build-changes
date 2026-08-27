import com.mojang.serialization.Codec;

public enum esw implements ats, auk {
   a(0, "false", "options.off"),
   b(1, "fast", "options.clouds.fast"),
   c(2, "true", "options.clouds.fancy");

   public static final Codec<esw> d = auk.a(esw::values);
   private final int e;
   private final String f;
   private final String g;

   private esw(int $$0, String $$1, String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public String c() {
      return this.f;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.g;
   }
}
