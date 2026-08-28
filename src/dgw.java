import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgw extends dgs {
   public static final MapCodec<dgw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgo.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dgw::new)
   );
   private final ju<dgo> c;
   private final int d;
   private final int e;

   public dgw(ju<dgo> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jq<dgo>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dgs> a() {
      return b;
   }

   @Override
   public jq<dgo> getNoiseBiome(int $$0, int $$1, int $$2, dgx.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
