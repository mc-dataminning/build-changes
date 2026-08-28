import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzf extends dzk {
   private final jm<dex> e;
   public static final MapCodec<dzf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzf::new)
   );

   public dzf(kd $$0, jm<dex> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsa $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dza<?> a() {
      return dza.a;
   }
}
