import com.mojang.serialization.MapCodec;

public class eko extends eld {
   public static final MapCodec<eko> a = drb.b.fieldOf("block_state").xmap(eko::new, $$0 -> $$0.b);
   private final drb b;

   public eko(drb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drb $$0, ayk $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ele<?> a() {
      return ele.c;
   }
}
