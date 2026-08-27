import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dbb extends dax {
   public static final Codec<dbb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dat.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dbb::new)
   );
   private final iz<dat> c;
   private final int d;
   private final int e;

   public dbb(iz<dat> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<iv<dat>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends dax> a() {
      return b;
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2, dbc.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
