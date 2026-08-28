import com.mojang.serialization.Codec;

public enum emc implements bab {
   a("linear"),
   b("triangular");

   public static final Codec<emc> c = bab.a(emc::values);
   private final String d;

   private emc(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azn $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
