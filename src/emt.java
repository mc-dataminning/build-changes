import com.mojang.serialization.Codec;

public enum emt implements bag {
   a("linear"),
   b("triangular");

   public static final Codec<emt> c = bag.a(emt::values);
   private final String d;

   private emt(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azs $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
