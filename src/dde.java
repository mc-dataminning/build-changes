import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dde extends dda {
   public static final MapCodec<dde> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcw.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dde::new)
   );
   private final jm<dcw> c;
   private final int d;
   private final int e;

   public dde(jm<dcw> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ji<dcw>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dda> a() {
      return b;
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2, ddf.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
