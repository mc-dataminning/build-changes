import com.mojang.serialization.Codec;

public class emv implements enb {
   public static final Codec<emv> a = buh.b(0, 256).fieldOf("count").xmap(emv::new, emv::a).codec();
   private final buh b;

   public emv(int $$0) {
      this.b = bue.a($$0);
   }

   public emv(buh $$0) {
      this.b = $$0;
   }

   public buh a() {
      return this.b;
   }
}
