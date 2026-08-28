import com.mojang.serialization.Codec;

public enum elc implements bai {
   a(jm.b, 1, "ceiling"),
   b(jm.a, -1, "floor");

   public static final Codec<elc> c = bai.a(elc::values);
   private final jm d;
   private final int e;
   private final String f;

   private elc(final jm $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jm a() {
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
