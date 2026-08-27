import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dmk {
   final aqh<csv> a;
   public static final Codec<dme> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqh.a(jc.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dme::new));

   protected dme(hy $$0, aqh<csv> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dma<?> a() {
      return dma.b;
   }
}
