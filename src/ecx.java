import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecx extends edb {
   private final ju<ern> e;
   public static final MapCodec<ecx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(ma.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ecx::new)
   );

   public ecx(kl $$0, ju<ern> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvo $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ecr<?> a() {
      return ecr.c;
   }
}
