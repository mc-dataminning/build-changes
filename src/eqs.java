import com.mojang.serialization.MapCodec;

public class eqs extends eri {
   public static final MapCodec<eqs> a = dwx.a.fieldOf("block_state").xmap(eqs::new, $$0 -> $$0.b);
   private final dwx b;

   public eqs(dwx $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwx $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected erj<?> a() {
      return erj.c;
   }
}
