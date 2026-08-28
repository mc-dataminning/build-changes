import com.mojang.serialization.Codec;

public enum bst implements bag {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bst> d = bag.a(bst::values);
   private final String e;

   private bst(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
