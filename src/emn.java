import com.mojang.serialization.Codec;

public enum emn implements baf {
   a("linear"),
   b("triangular");

   public static final Codec<emn> c = baf.a(emn::values);
   private final String d;

   private emn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azr $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
