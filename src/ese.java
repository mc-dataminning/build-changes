import com.mojang.serialization.Codec;

public enum ese implements bak {
   a("linear"),
   b("triangular");

   public static final Codec<ese> c = bak.a(ese::values);
   private final String d;

   private ese(final String $$0) {
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
