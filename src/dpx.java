import com.mojang.serialization.Codec;

public class dpx implements dqc {
   public static final Codec<dpx> a = bgf.b(0, 256).fieldOf("count").xmap(dpx::new, dpx::a).codec();
   private final bgf b;

   public dpx(int $$0) {
      this.b = bgc.a($$0);
   }

   public dpx(bgf $$0) {
      this.b = $$0;
   }

   public bgf a() {
      return this.b;
   }
}
