import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzj extends dzo {
   private final jm<dfb> e;
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzj::new)
   );

   public dzj(kd $$0, jm<dfb> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dse $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dze<?> a() {
      return dze.a;
   }
}
