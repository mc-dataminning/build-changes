import com.mojang.serialization.Codec;

public enum ehd implements azs {
   a(je.b, 1, "ceiling"),
   b(je.a, -1, "floor");

   public static final Codec<ehd> c = azs.a(ehd::values);
   private final je d;
   private final int e;
   private final String f;

   private ehd(final je $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public je a() {
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
