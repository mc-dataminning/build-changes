import com.mojang.serialization.Codec;

public enum dyi implements auk {
   a("linear"),
   b("triangular");

   public static final Codec<dyi> c = auk.a(dyi::values);
   private final String d;

   private dyi(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(atw $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
