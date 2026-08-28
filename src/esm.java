import com.mojang.serialization.MapCodec;

public class esm extends etc {
   public static final MapCodec<esm> a = dym.a.fieldOf("block_state").xmap(esm::new, $$0 -> $$0.b);
   private final dym b;

   public esm(dym $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dym $$0, azs $$1) {
      return $$0 == this.b;
   }

   @Override
   protected etd<?> a() {
      return etd.c;
   }
}
