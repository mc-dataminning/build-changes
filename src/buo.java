import com.mojang.serialization.Codec;

public enum buo implements bai {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<buo> d = bai.a(buo::values);
   private final String e;

   private buo(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
