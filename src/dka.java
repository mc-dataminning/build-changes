import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dka extends djw {
   public static final MapCodec<dka> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djs.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dka::new)
   );
   private final ji<djs> c;
   private final int d;
   private final int e;

   public dka(ji<djs> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<je<djs>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends djw> a() {
      return b;
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2, dkb.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
