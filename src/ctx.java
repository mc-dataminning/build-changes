import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctx(jj<dla> c) implements cub {
   public static final MapCodec<ctx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.aG).fieldOf("biomes").forGetter(ctx::b)).apply($$0, ctx::new));

   public boolean a(cud $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<ctx> a() {
      return a;
   }

   public jj<dla> b() {
      return this.c;
   }
}
