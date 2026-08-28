import com.mojang.serialization.Codec;

public enum ene implements bai {
   a("linear"),
   b("triangular");

   public static final Codec<ene> c = bai.a(ene::values);
   private final String d;

   private ene(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azu $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
