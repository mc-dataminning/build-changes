import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddd extends dcz {
   public static final MapCodec<ddd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcv.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, ddd::new)
   );
   private final jm<dcv> c;
   private final int d;
   private final int e;

   public ddd(jm<dcv> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ji<dcv>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dcz> a() {
      return b;
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2, dde.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
