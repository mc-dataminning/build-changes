import com.mojang.serialization.Codec;

public enum egm implements ayg {
   a("linear"),
   b("triangular");

   public static final Codec<egm> c = ayg.a(egm::values);
   private final String d;

   private egm(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(axt $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
