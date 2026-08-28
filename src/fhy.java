import com.mojang.serialization.Codec;

public enum fhy {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   public static final Codec<fhy> h = Codec.INT.xmap(fhy::a, fhy::a);
   private final int i;

   private fhy(final int $$0) {
      this.i = $$0;
   }

   public static fhy a(int $$0) {
      for (fhy $$1 : values()) {
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
