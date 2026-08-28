import com.mojang.serialization.Codec;

public enum esx implements bam {
   a("linear"),
   b("triangular");

   public static final Codec<esx> c = bam.a(esx::values);
   private final String d;

   private esx(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azx $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
