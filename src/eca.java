import com.mojang.serialization.Codec;

public enum eca implements axc {
   a("linear"),
   b("triangular");

   public static final Codec<eca> c = axc.a(eca::values);
   private final String d;

   private eca(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(awo $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
