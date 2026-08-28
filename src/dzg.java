import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzg extends dzk {
   private final jm<ens> e;
   public static final MapCodec<dzg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzg::new)
   );

   public dzg(kd $$0, jm<ens> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsa $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dza<?> a() {
      return dza.c;
   }
}
