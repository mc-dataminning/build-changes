import com.mojang.serialization.Codec;

public enum etj implements bax {
   a("linear"),
   b("triangular");

   public static final Codec<etj> c = bax.a(etj::values);
   private final String d;

   private etj(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(bai $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
