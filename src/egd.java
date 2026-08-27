import com.mojang.serialization.Codec;

public enum egd implements aye {
   a("linear"),
   b("triangular");

   public static final Codec<egd> c = aye.a(egd::values);
   private final String d;

   private egd(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(axr $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
