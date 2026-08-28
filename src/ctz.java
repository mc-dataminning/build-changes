import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctz(cw.c c) implements cub {
   public static final MapCodec<ctz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cw.c.d.fieldOf("range").forGetter(ctz::b)).apply($$0, ctz::new));

   public boolean a(cud $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<ctz> a() {
      return a;
   }

   public cw.c b() {
      return this.c;
   }
}
