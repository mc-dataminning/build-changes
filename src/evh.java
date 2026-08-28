import com.mojang.serialization.MapCodec;

public class evh extends evx {
   public static final MapCodec<evh> a = ebe.a.fieldOf("block_state").xmap(evh::new, $$0 -> $$0.b);
   private final ebe b;

   public evh(ebe $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebe $$0, azx $$1) {
      return $$0 == this.b;
   }

   @Override
   protected evy<?> a() {
      return evy.c;
   }
}
