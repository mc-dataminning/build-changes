import com.mojang.serialization.Codec;

public enum ejw implements azz {
   a(jj.b, 1, "ceiling"),
   b(jj.a, -1, "floor");

   public static final Codec<ejw> c = azz.a(ejw::values);
   private final jj d;
   private final int e;
   private final String f;

   private ejw(final jj $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jj a() {
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
