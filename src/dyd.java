import com.mojang.serialization.Codec;

public enum dyd implements aug {
   a("linear"),
   b("triangular");

   public static final Codec<dyd> c = aug.a(dyd::values);
   private final String d;

   private dyd(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ats $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
