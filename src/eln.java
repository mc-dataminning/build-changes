import com.mojang.serialization.MapCodec;

public class eln extends emc {
   public static final MapCodec<eln> a = dsa.b.fieldOf("block_state").xmap(eln::new, $$0 -> $$0.b);
   private final dsa b;

   public eln(dsa $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emd<?> a() {
      return emd.c;
   }
}
