import com.mojang.serialization.Codec;

public enum erx implements bak {
   a("linear"),
   b("triangular");

   public static final Codec<erx> c = bak.a(erx::values);
   private final String d;

   private erx(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azv $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
