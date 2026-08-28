import com.mojang.serialization.Codec;

public enum flf implements azc, azv {
   a(0, "minimized", "options.inactivityFpsLimit.minimized"),
   b(1, "afk", "options.inactivityFpsLimit.afk");

   public static final Codec<flf> c = azv.a(flf::values);
   private final int d;
   private final String e;
   private final String f;

   private flf(final int $$0, final String $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public int b() {
      return this.d;
   }

   @Override
   public String a() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
