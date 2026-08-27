import com.mojang.serialization.Codec;

public enum dzk implements aut {
   a("linear"),
   b("triangular");

   public static final Codec<dzk> c = aut.a(dzk::values);
   private final String d;

   private dzk(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(auf $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
