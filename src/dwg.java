import com.mojang.serialization.Codec;

public enum dwg implements asr {
   a("linear"),
   b("triangular");

   public static final Codec<dwg> c = asr.a(dwg::values);
   private final String d;

   private dwg(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ase $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
