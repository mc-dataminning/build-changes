import com.mojang.serialization.MapCodec;

public class elo extends emd {
   public static final MapCodec<elo> a = dsb.b.fieldOf("block_state").xmap(elo::new, $$0 -> $$0.b);
   private final dsb b;

   public elo(dsb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eme<?> a() {
      return eme.c;
   }
}
