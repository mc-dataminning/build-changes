import com.mojang.serialization.Codec;

public enum dww implements atr {
   a("linear"),
   b("triangular");

   public static final Codec<dww> c = atr.a(dww::values);
   private final String d;

   private dww(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ate $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
