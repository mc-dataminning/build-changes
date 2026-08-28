import com.mojang.serialization.MapCodec;

public class euo extends eve {
   public static final MapCodec<euo> a = eao.a.fieldOf("block_state").xmap(euo::new, $$0 -> $$0.b);
   private final eao b;

   public euo(eao $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eao $$0, azv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected evf<?> a() {
      return evf.c;
   }
}
