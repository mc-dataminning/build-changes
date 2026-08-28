import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctm(jj<dkp> c) implements ctq {
   public static final MapCodec<ctm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.aG).fieldOf("biomes").forGetter(ctm::b)).apply($$0, ctm::new));

   public boolean a(cts $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<ctm> a() {
      return a;
   }

   public jj<dkp> b() {
      return this.c;
   }
}
