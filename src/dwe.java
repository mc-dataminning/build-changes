import com.mojang.serialization.Codec;

public enum dwe implements asp {
   a("linear"),
   b("triangular");

   public static final Codec<dwe> c = asp.a(dwe::values);
   private final String d;

   private dwe(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(asc $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
