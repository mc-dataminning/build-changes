import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmf extends dmk {
   private final hi<csv> e;
   public static final Codec<dmf> a = RecordCodecBuilder.create($$0 -> a($$0).and(hs.a(jc.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dmf::new));

   public dmf(hy $$0, hi<csv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dma<?> a() {
      return dma.a;
   }
}
