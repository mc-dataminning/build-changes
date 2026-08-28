import com.mojang.serialization.Codec;

public enum ejh implements azu {
   a("linear"),
   b("triangular");

   public static final Codec<ejh> c = azu.a(ejh::values);
   private final String d;

   private ejh(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azh $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
