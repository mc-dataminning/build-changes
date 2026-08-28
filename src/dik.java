import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dik extends dig {
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dik::new)
   );
   private final jv<dic> c;
   private final int d;
   private final int e;

   public dik(jv<dic> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jr<dic>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return b;
   }

   @Override
   public jr<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
