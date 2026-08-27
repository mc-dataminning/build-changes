import com.mojang.serialization.Codec;

public enum dvu implements ash {
   a("linear"),
   b("triangular");

   public static final Codec<dvu> c = ash.a(dvu::values);
   private final String d;

   private dvu(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(aru $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
