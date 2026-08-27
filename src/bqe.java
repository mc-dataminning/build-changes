import com.mojang.serialization.Codec;

public enum bqe implements ayt {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqe> d = ayt.a(bqe::values);
   private final String e;

   private bqe(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
