import com.mojang.serialization.MapCodec;

public class eqr extends erh {
   public static final MapCodec<eqr> a = dww.a.fieldOf("block_state").xmap(eqr::new, $$0 -> $$0.b);
   private final dww b;

   public eqr(dww $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dww $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eri<?> a() {
      return eri.c;
   }
}
