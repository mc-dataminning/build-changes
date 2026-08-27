import com.mojang.serialization.Codec;

public class dpk implements dpp {
   public static final Codec<dpk> a = bft.b(0, 256).fieldOf("count").xmap(dpk::new, dpk::a).codec();
   private final bft b;

   public dpk(int $$0) {
      this.b = bfq.a($$0);
   }

   public dpk(bft $$0) {
      this.b = $$0;
   }

   public bft a() {
      return this.b;
   }
}
