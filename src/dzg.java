import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzg extends dzl {
   private final jm<dey> e;
   public static final MapCodec<dzg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzg::new)
   );

   public dzg(kd $$0, jm<dey> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzb<?> a() {
      return dzb.a;
   }
}
