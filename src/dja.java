import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dja extends diw {
   public static final MapCodec<dja> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dis.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dja::new)
   );
   private final jw<dis> c;
   private final int d;
   private final int e;

   public dja(jw<dis> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<js<dis>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends diw> a() {
      return b;
   }

   @Override
   public js<dis> getNoiseBiome(int $$0, int $$1, int $$2, djb.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
