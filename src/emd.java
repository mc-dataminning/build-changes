import com.mojang.serialization.MapCodec;

public class emd extends ems {
   public static final MapCodec<emd> a = dsl.b.fieldOf("block_state").xmap(emd::new, $$0 -> $$0.b);
   private final dsl b;

   public emd(dsl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsl $$0, ayo $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emt<?> a() {
      return emt.c;
   }
}
