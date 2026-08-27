import com.mojang.serialization.Codec;

public enum bkm implements ave {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bkm> d = ave.a(bkm::values);
   private final String e;

   private bkm(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
