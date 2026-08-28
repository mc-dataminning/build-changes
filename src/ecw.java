import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecw extends edb {
   private final ju<dij> e;
   public static final MapCodec<ecw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(ma.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ecw::new)
   );

   public ecw(kl $$0, ju<dij> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvo $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ecr<?> a() {
      return ecr.a;
   }
}
