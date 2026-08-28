import com.mojang.serialization.MapCodec;

public class eum extends eve {
   public static final MapCodec<eum> a = mg.e.q().fieldOf("block").xmap(eum::new, $$0 -> $$0.b);
   private final dmm b;

   public eum(dmm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eao $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evf<?> a() {
      return evf.b;
   }
}
