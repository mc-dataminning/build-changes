import com.mojang.serialization.Codec;

public enum ekl implements azk {
   a("linear"),
   b("triangular");

   public static final Codec<ekl> c = azk.a(ekl::values);
   private final String d;

   private ekl(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayw $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
