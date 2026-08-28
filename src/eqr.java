import com.mojang.serialization.MapCodec;

public class eqr extends erj {
   public static final MapCodec<eqr> a = mb.e.q().fieldOf("block").xmap(eqr::new, $$0 -> $$0.b);
   private final djn b;

   public eqr(djn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwy $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erk<?> a() {
      return erk.b;
   }
}
