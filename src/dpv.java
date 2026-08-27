import com.mojang.serialization.Codec;

public class dpv implements dqa {
   public static final Codec<dpv> a = bgd.b(0, 256).fieldOf("count").xmap(dpv::new, dpv::a).codec();
   private final bgd b;

   public dpv(int $$0) {
      this.b = bga.a($$0);
   }

   public dpv(bgd $$0) {
      this.b = $$0;
   }

   public bgd a() {
      return this.b;
   }
}
