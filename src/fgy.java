import com.mojang.serialization.Codec;

public enum fgy {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   public static final Codec<fgy> h = Codec.INT.xmap(fgy::a, fgy::a);
   private final int i;

   private fgy(final int $$0) {
      this.i = $$0;
   }

   public static fgy a(int $$0) {
      for (fgy $$1 : values()) {
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
