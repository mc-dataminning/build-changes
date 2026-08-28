import com.mojang.serialization.Codec;

public enum bsx implements baj {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsx> d = baj.a(bsx::values);
   private final String e;

   private bsx(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
