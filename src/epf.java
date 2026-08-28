import com.mojang.serialization.Codec;

public enum epf implements bba {
   a("linear"),
   b("triangular");

   public static final Codec<epf> c = bba.a(epf::values);
   private final String d;

   private epf(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(bam $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
