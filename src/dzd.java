import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzd extends dzh {
   private final jm<enp> e;
   public static final MapCodec<dzd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzd::new)
   );

   public dzd(kd $$0, jm<enp> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drx $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dyx<?> a() {
      return dyx.c;
   }
}
