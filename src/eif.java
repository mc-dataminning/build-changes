import com.mojang.serialization.Codec;

public enum eif implements ayx {
   a("linear"),
   b("triangular");

   public static final Codec<eif> c = ayx.a(eif::values);
   private final String d;

   private eif(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayk $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
