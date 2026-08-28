import com.mojang.serialization.Codec;

public enum fhm {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   public static final Codec<fhm> h = Codec.INT.xmap(fhm::a, fhm::a);
   private final int i;

   private fhm(final int $$0) {
      this.i = $$0;
   }

   public static fhm a(int $$0) {
      for (fhm $$1 : values()) {
         if ($$1.i == $$0) {
            return $$1;
         }
      }

      return $$0 < a.i ? a : g;
   }

   public int a() {
      return this.i;
   }
}
