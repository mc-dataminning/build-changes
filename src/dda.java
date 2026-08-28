import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dda extends dcw {
   public static final MapCodec<dda> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcs.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dda::new)
   );
   private final jm<dcs> c;
   private final int d;
   private final int e;

   public dda(jm<dcs> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ji<dcs>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dcw> a() {
      return b;
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2, ddb.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
