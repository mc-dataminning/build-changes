import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dfs extends dfo {
   public static final MapCodec<dfs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfk.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dfs::new)
   );
   private final js<dfk> c;
   private final int d;
   private final int e;

   public dfs(js<dfk> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jo<dfk>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dfo> a() {
      return b;
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2, dft.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
