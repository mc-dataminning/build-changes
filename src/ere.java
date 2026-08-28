import com.mojang.serialization.Codec;

public enum ere implements bai {
   a("linear"),
   b("triangular");

   public static final Codec<ere> c = bai.a(ere::values);
   private final String d;

   private ere(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azt $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
