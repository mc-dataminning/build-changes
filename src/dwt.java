import com.mojang.serialization.Codec;

public class dwt implements dwy {
   public static final Codec<dwt> a = blq.b(0, 256).fieldOf("count").xmap(dwt::new, dwt::a).codec();
   private final blq b;

   public dwt(int $$0) {
      this.b = bln.a($$0);
   }

   public dwt(blq $$0) {
      this.b = $$0;
   }

   public blq a() {
      return this.b;
   }
}
