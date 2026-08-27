import com.mojang.serialization.Codec;

public enum edc implements axg {
   a("linear"),
   b("triangular");

   public static final Codec<edc> c = axg.a(edc::values);
   private final String d;

   private edc(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(awt $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
