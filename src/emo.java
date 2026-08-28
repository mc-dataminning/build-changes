import com.mojang.serialization.MapCodec;

public class emo extends emg {
   public static final MapCodec<emo> a = axf.a(lq.f).fieldOf("tag").xmap(emo::new, $$0 -> $$0.b);
   private final axf<dfb> b;

   public emo(axf<dfb> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dse $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emh<?> a() {
      return emh.d;
   }
}
