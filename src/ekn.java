import com.mojang.serialization.Codec;

public enum ekn implements azk {
   a("linear"),
   b("triangular");

   public static final Codec<ekn> c = azk.a(ekn::values);
   private final String d;

   private ekn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayw $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
