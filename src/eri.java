import com.mojang.serialization.MapCodec;

public class eri extends ery {
   public static final MapCodec<eri> a = dxn.a.fieldOf("block_state").xmap(eri::new, $$0 -> $$0.b);
   private final dxn b;

   public eri(dxn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxn $$0, bam $$1) {
      return $$0 == this.b;
   }

   @Override
   protected erz<?> a() {
      return erz.c;
   }
}
