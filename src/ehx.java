import com.mojang.serialization.Codec;

public class ehx implements eic {
   public static final Codec<ehx> a = brp.b(0, 256).fieldOf("count").xmap(ehx::new, ehx::a).codec();
   private final brp b;

   public ehx(int $$0) {
      this.b = brm.a($$0);
   }

   public ehx(brp $$0) {
      this.b = $$0;
   }

   public brp a() {
      return this.b;
   }
}
