import com.mojang.serialization.Codec;

public enum edy implements axq {
   a("linear"),
   b("triangular");

   public static final Codec<edy> c = axq.a(edy::values);
   private final String d;

   private edy(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(axd $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
