import com.mojang.serialization.MapCodec;

public class elp extends emg {
   public static final MapCodec<elp> a = lp.e.q().fieldOf("block").xmap(elp::new, $$0 -> $$0.b);
   private final dfb b;

   public elp(dfb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dse $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emh<?> a() {
      return emh.b;
   }
}
