import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dge extends dga {
   public static final MapCodec<dge> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfw.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dge::new)
   );
   private final jt<dfw> c;
   private final int d;
   private final int e;

   public dge(jt<dfw> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jp<dfw>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dga> a() {
      return b;
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2, dgf.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
