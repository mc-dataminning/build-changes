import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dma extends dme {
   private final hi<eaf> e;
   public static final Codec<dma> a = RecordCodecBuilder.create($$0 -> a($$0).and(hs.a(jc.x).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dma::new));

   public dma(hy $$0, hi<eaf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dlu<?> a() {
      return dlu.c;
   }
}
