import com.mojang.serialization.Codec;

public enum eak implements avl {
   a("linear"),
   b("triangular");

   public static final Codec<eak> c = avl.a(eak::values);
   private final String d;

   private eak(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(auw $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
