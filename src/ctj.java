import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctj(jj<dkk> c) implements ctn {
   public static final MapCodec<ctj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.aG).fieldOf("biomes").forGetter(ctj::b)).apply($$0, ctj::new));

   public boolean a(ctp $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<ctj> a() {
      return a;
   }

   public jj<dkk> b() {
      return this.c;
   }
}
