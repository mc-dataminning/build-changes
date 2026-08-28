import com.mojang.serialization.Codec;

public enum eoz implements baq {
   a("linear"),
   b("triangular");

   public static final Codec<eoz> c = baq.a(eoz::values);
   private final String d;

   private eoz(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(bac $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
