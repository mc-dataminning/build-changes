import com.mojang.serialization.MapCodec;

public class eqt extends erj {
   public static final MapCodec<eqt> a = dwy.a.fieldOf("block_state").xmap(eqt::new, $$0 -> $$0.b);
   private final dwy b;

   public eqt(dwy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwy $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected erk<?> a() {
      return erk.c;
   }
}
