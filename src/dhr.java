import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dhr extends dhn {
   public static final MapCodec<dhr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhj.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dhr::new)
   );
   private final jv<dhj> c;
   private final int d;
   private final int e;

   public dhr(jv<dhj> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jr<dhj>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dhn> a() {
      return b;
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2, dhs.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
