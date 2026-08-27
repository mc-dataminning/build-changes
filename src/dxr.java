import com.mojang.serialization.Codec;

public enum dxr implements aub {
   a("linear"),
   b("triangular");

   public static final Codec<dxr> c = aub.a(dxr::values);
   private final String d;

   private dxr(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ato $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
