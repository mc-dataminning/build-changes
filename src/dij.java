import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dij extends dif {
   public static final MapCodec<dij> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dib.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dij::new)
   );
   private final ju<dib> c;
   private final int d;
   private final int e;

   public dij(ju<dib> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jq<dib>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dif> a() {
      return b;
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2, dik.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
