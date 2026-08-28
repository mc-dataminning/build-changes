import com.mojang.serialization.Codec;

public enum ejg implements azu {
   a("linear"),
   b("triangular");

   public static final Codec<ejg> c = azu.a(ejg::values);
   private final String d;

   private ejg(final String $$0) {
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
