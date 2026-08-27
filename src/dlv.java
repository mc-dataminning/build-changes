import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlv extends dma {
   private final hi<csl> e;
   public static final Codec<dlv> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dlv::new));

   public dlv(hz $$0, hi<csl> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dez $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dlq<?> a() {
      return dlq.a;
   }
}
