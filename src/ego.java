import com.mojang.serialization.Codec;

public class ego implements egt {
   public static final Codec<ego> a = brm.b(0, 256).fieldOf("count").xmap(ego::new, ego::a).codec();
   private final brm b;

   public ego(int $$0) {
      this.b = brj.a($$0);
   }

   public ego(brm $$0) {
      this.b = $$0;
   }

   public brm a() {
      return this.b;
   }
}
