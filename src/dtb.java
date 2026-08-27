import com.mojang.serialization.Codec;

public class dtb implements dtg {
   public static final Codec<dtb> a = biq.b(0, 256).fieldOf("count").xmap(dtb::new, dtb::a).codec();
   private final biq b;

   public dtb(int $$0) {
      this.b = bin.a($$0);
   }

   public dtb(biq $$0) {
      this.b = $$0;
   }

   public biq a() {
      return this.b;
   }
}
