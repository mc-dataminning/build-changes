import com.mojang.serialization.Codec;

public class dpc extends dot {
   public static final Codec<dpc> b = dcb.b.fieldOf("state").xmap(dpc::new, $$0 -> $$0.c).codec();
   private final dcb c;

   protected dpc(dcb $$0) {
      this.c = $$0;
   }

   @Override
   protected dou<?> a() {
      return dou.a;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      return this.c;
   }
}
