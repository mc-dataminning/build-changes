import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dmk {
   final aqi<csv> a;
   public static final Codec<dme> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqi.a(je.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dme::new));

   protected dme(ib $$0, aqi<csv> $$1) {
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
