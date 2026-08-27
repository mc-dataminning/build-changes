import com.mojang.serialization.Codec;

public class dpp implements dpu {
   public static final Codec<dpp> a = bgj.b(0, 256).fieldOf("count").xmap(dpp::new, dpp::a).codec();
   private final bgj b;

   public dpp(int $$0) {
      this.b = bgg.a($$0);
   }

   public dpp(bgj $$0) {
      this.b = $$0;
   }

   public bgj a() {
      return this.b;
   }
}
