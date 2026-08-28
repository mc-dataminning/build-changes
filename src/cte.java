import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cte(cv.c c) implements ctg {
   public static final MapCodec<cte> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.c.d.fieldOf("range").forGetter(cte::b)).apply($$0, cte::new));

   public boolean a(cti $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<cte> a() {
      return a;
   }

   public cv.c b() {
      return this.c;
   }
}
