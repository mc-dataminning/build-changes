import com.mojang.serialization.Codec;

public enum ffb implements ayh, ayz {
   a(0, "false", "options.off"),
   b(1, "fast", "options.clouds.fast"),
   c(2, "true", "options.clouds.fancy");

   public static final Codec<ffb> d = ayz.a(ffb::values);
   private final int e;
   private final String f;
   private final String g;

   private ffb(final int $$0, final String $$1, final String $$2) {
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
