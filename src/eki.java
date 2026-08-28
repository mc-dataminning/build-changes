import com.mojang.serialization.Codec;

public enum eki implements azj {
   a("linear"),
   b("triangular");

   public static final Codec<eki> c = azj.a(eki::values);
   private final String d;

   private eki(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayv $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
