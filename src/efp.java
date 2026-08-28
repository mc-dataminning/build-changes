import com.mojang.serialization.Codec;

public class efp implements efu {
   public static final Codec<efp> a = bqu.b(0, 256).fieldOf("count").xmap(efp::new, efp::a).codec();
   private final bqu b;

   public efp(int $$0) {
      this.b = bqr.a($$0);
   }

   public efp(bqu $$0) {
      this.b = $$0;
   }

   public bqu a() {
      return this.b;
   }
}
