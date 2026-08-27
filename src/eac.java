import com.mojang.serialization.Codec;

public enum eac implements avk {
   a("linear"),
   b("triangular");

   public static final Codec<eac> c = avk.a(eac::values);
   private final String d;

   private eac(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(auv $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
