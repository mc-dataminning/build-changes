import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddl extends ddh {
   public static final MapCodec<ddl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddd.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, ddl::new)
   );
   private final jn<ddd> c;
   private final int d;
   private final int e;

   public ddl(jn<ddd> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jj<ddd>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends ddh> a() {
      return b;
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2, ddm.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
