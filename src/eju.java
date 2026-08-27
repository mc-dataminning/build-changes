import com.mojang.serialization.Codec;

public class eju extends ekj {
   public static final Codec<eju> a = dqh.b.fieldOf("block_state").xmap(eju::new, $$0 -> $$0.b).codec();
   private final dqh b;

   public eju(dqh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dqh $$0, ayg $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ekk<?> a() {
      return ekk.c;
   }
}
