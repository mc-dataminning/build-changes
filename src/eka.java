import com.mojang.serialization.Codec;

public enum eka implements bab {
   a(jk.b, 1, "ceiling"),
   b(jk.a, -1, "floor");

   public static final Codec<eka> c = bab.a(eka::values);
   private final jk d;
   private final int e;
   private final String f;

   private eka(final jk $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jk a() {
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
