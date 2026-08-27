import com.mojang.serialization.Codec;

public enum dvy implements asu {
   a("linear"),
   b("triangular");

   public static final Codec<dvy> c = asu.a(dvy::values);
   private final String d;

   private dvy(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ash $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
