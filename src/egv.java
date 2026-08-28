import com.mojang.serialization.Codec;

public class egv implements eha {
   public static final Codec<egv> a = brp.b(0, 256).fieldOf("count").xmap(egv::new, egv::a).codec();
   private final brp b;

   public egv(int $$0) {
      this.b = brm.a($$0);
   }

   public egv(brp $$0) {
      this.b = $$0;
   }

   public brp a() {
      return this.b;
   }
}
