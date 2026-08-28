import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dfp extends dfl {
   public static final MapCodec<dfp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfh.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dfp::new)
   );
   private final jr<dfh> c;
   private final int d;
   private final int e;

   public dfp(jr<dfh> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jn<dfh>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dfl> a() {
      return b;
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2, dfq.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
