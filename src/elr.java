import com.mojang.serialization.MapCodec;

public class elr extends emg {
   public static final MapCodec<elr> a = dse.b.fieldOf("block_state").xmap(elr::new, $$0 -> $$0.b);
   private final dse b;

   public elr(dse $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dse $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emh<?> a() {
      return emh.c;
   }
}
