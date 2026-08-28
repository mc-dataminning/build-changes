import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csz(cv.c c) implements ctb {
   public static final MapCodec<csz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cv.c.d.fieldOf("range").forGetter(csz::b)).apply($$0, csz::new));

   public boolean a(ctd $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<csz> a() {
      return a;
   }

   public cv.c b() {
      return this.c;
   }
}
