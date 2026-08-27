import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlw extends dma {
   private final hi<eab> e;
   public static final Codec<dlw> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dlw::new));

   public dlw(hz $$0, hi<eab> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dez $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dlq<?> a() {
      return dlq.c;
   }
}
