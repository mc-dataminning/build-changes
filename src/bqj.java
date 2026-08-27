import com.mojang.serialization.Codec;

public enum bqj implements ayt {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bqj> d = ayt.a(bqj::values);
   private final String e;

   private bqj(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
