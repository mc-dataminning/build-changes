import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ect extends ecx {
   private final ju<erj> e;
   public static final MapCodec<ect> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(lz.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ect::new)
   );

   public ect(kl $$0, ju<erj> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvj $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ecn<?> a() {
      return ecn.c;
   }
}
