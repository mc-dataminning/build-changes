import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dee extends dea {
   public static final MapCodec<dee> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddw.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dee::new)
   );
   private final jq<ddw> c;
   private final int d;
   private final int e;

   public dee(jq<ddw> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jm<ddw>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dea> a() {
      return b;
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2, def.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
