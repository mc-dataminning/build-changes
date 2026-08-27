import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cuf extends cub {
   public static final Codec<cuf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctx.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cuf::new)
   );
   private final ij<ctx> c;
   private final int d;
   private final int e;

   public cuf(ij<ctx> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ie<ctx>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cub> a() {
      return b;
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2, cug.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
