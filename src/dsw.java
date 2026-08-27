import com.mojang.serialization.Codec;

public enum dsw implements apr {
   a("linear"),
   b("triangular");

   public static final Codec<dsw> c = apr.a(dsw::values);
   private final String d;

   private dsw(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(apf $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
