import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efx extends egd {
   final axp<dku> a;
   public static final MapCodec<efx> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.a(me.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, efx::new)
   );

   protected efx(kn $$0, axp<dku> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eft<?> a() {
      return eft.b;
   }
}
