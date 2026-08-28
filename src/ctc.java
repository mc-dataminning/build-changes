import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctc(ji<dkd> c) implements ctg {
   public static final MapCodec<ctc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.aG).fieldOf("biomes").forGetter(ctc::b)).apply($$0, ctc::new));

   public boolean a(cti $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<ctc> a() {
      return a;
   }

   public ji<dkd> b() {
      return this.c;
   }
}
