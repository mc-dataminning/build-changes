import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cst(cv.c c) implements csv {
   public static final MapCodec<cst> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.c.d.fieldOf("range").forGetter(cst::b)).apply($$0, cst::new));

   public boolean a(csx $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<cst> a() {
      return a;
   }

   public cv.c b() {
      return this.c;
   }
}
