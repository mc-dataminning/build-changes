import com.mojang.serialization.Codec;

public enum eoj implements azv {
   a("linear"),
   b("triangular");

   public static final Codec<eoj> c = azv.a(eoj::values);
   private final String d;

   private eoj(final String $$0) {
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
