import com.mojang.serialization.Codec;

public enum dvz implements ask {
   a("linear"),
   b("triangular");

   public static final Codec<dvz> c = ask.a(dvz::values);
   private final String d;

   private dvz(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(arx $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
