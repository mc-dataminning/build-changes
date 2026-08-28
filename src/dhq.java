import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dhq extends dhm {
   public static final MapCodec<dhq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhi.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dhq::new)
   );
   private final jv<dhi> c;
   private final int d;
   private final int e;

   public dhq(jv<dhi> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jr<dhi>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dhm> a() {
      return b;
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2, dhr.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
