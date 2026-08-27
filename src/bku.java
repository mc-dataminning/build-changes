import com.mojang.serialization.Codec;

public enum bku implements avl {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bku> d = avl.a(bku::values);
   private final String e;

   private bku(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
