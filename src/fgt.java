import com.mojang.serialization.Codec;

public enum fgt {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   public static final Codec<fgt> h = Codec.INT.xmap(fgt::a, fgt::a);
   private final int i;

   private fgt(final int $$0) {
      this.i = $$0;
   }

   public static fgt a(int $$0) {
      for (fgt $$1 : values()) {
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
