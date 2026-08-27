import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dma extends dmf {
   private final hk<csq> e;
   public static final Codec<dma> a = RecordCodecBuilder.create($$0 -> a($$0).and(hv.a(je.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dma::new));

   public dma(ib $$0, hk<csq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dlv<?> a() {
      return dlv.a;
   }
}
