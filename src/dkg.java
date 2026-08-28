import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkg extends dkc {
   public static final MapCodec<dkg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djy.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dkg::new)
   );
   private final ji<djy> c;
   private final int d;
   private final int e;

   public dkg(ji<djy> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<je<djy>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dkc> a() {
      return b;
   }

   @Override
   public je<djy> getNoiseBiome(int $$0, int $$1, int $$2, dkh.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
