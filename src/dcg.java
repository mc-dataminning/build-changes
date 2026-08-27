import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dcg extends dcc {
   public static final MapCodec<dcg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dby.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dcg::new)
   );
   private final jb<dby> c;
   private final int d;
   private final int e;

   public dcg(jb<dby> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ix<dby>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dcc> a() {
      return b;
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2, dch.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
