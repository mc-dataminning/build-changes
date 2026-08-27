import com.mojang.serialization.Codec;

public enum ekp implements azg {
   a("linear"),
   b("triangular");

   public static final Codec<ekp> c = azg.a(ekp::values);
   private final String d;

   private ekp(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayt $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
