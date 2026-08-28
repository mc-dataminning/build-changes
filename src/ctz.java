import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctz(jk<dlc> c) implements cud {
   public static final MapCodec<ctz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.aG).fieldOf("biomes").forGetter(ctz::b)).apply($$0, ctz::new));

   public boolean a(cuf $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<ctz> a() {
      return a;
   }

   public jk<dlc> b() {
      return this.c;
   }
}
