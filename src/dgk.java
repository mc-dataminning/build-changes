import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgk extends dgg {
   public static final MapCodec<dgk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgc.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dgk::new)
   );
   private final ju<dgc> c;
   private final int d;
   private final int e;

   public dgk(ju<dgc> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jq<dgc>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dgg> a() {
      return b;
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2, dgl.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
