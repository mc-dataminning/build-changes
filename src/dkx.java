import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkx extends dkt {
   public static final MapCodec<dkx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkp.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dkx::new)
   );
   private final jj<dkp> c;
   private final int d;
   private final int e;

   public dkx(jj<dkp> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jf<dkp>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dkt> a() {
      return b;
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2, dky.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
