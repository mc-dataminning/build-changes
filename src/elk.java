import com.mojang.serialization.Codec;

public enum elk implements azy {
   a("linear"),
   b("triangular");

   public static final Codec<elk> c = azy.a(elk::values);
   private final String d;

   private elk(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azk $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
