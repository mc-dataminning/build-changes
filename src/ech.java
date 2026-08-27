import com.mojang.serialization.Codec;

public enum ech implements axc {
   a("linear"),
   b("triangular");

   public static final Codec<ech> c = axc.a(ech::values);
   private final String d;

   private ech(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(awp $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
