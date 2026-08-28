import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dir extends din {
   public static final MapCodec<dir> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dir::new)
   );
   private final ju<dij> c;
   private final int d;
   private final int e;

   public dir(ju<dij> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jq<dij>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends din> a() {
      return b;
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2, dis.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
