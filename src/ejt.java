import com.mojang.serialization.Codec;

public enum ejt implements azc {
   a("linear"),
   b("triangular");

   public static final Codec<ejt> c = azc.a(ejt::values);
   private final String d;

   private ejt(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayo $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
