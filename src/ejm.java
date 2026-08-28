import com.mojang.serialization.Codec;

public enum ejm implements ayz {
   a("linear"),
   b("triangular");

   public static final Codec<ejm> c = ayz.a(ejm::values);
   private final String d;

   private ejm(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(aym $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
