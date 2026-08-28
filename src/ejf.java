import com.mojang.serialization.Codec;

public enum ejf implements azt {
   a("linear"),
   b("triangular");

   public static final Codec<ejf> c = azt.a(ejf::values);
   private final String d;

   private ejf(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azg $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
