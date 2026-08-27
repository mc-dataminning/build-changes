import com.mojang.serialization.Codec;

public enum bht implements asu {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bht> d = asu.a(bht::values);
   private final String e;

   private bht(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
