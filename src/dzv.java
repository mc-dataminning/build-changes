import com.mojang.serialization.Codec;

public enum dzv implements ave {
   a("linear"),
   b("triangular");

   public static final Codec<dzv> c = ave.a(dzv::values);
   private final String d;

   private dzv(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(aup $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
