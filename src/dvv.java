import com.mojang.serialization.Codec;

public enum dvv implements ash {
   a("linear"),
   b("triangular");

   public static final Codec<dvv> c = ash.a(dvv::values);
   private final String d;

   private dvv(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(aru $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
