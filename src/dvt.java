import com.mojang.serialization.Codec;

public enum dvt implements asf {
   a("linear"),
   b("triangular");

   public static final Codec<dvt> c = asf.a(dvt::values);
   private final String d;

   private dvt(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(art $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
