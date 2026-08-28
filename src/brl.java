import com.mojang.serialization.Codec;

public enum brl implements azt {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brl> d = azt.a(brl::values);
   private final String e;

   private brl(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
