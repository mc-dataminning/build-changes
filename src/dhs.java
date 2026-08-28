import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dhs extends dho {
   public static final MapCodec<dhs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhk.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dhs::new)
   );
   private final jv<dhk> c;
   private final int d;
   private final int e;

   public dhs(jv<dhk> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jr<dhk>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dho> a() {
      return b;
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2, dht.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
