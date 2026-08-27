import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fii(akh c) implements fig {
   public static final MapCodec<fii> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akh.a.fieldOf("id").forGetter(fii::c)).apply($$0, fii::new));

   @Override
   public fih a() {
      return fih.e;
   }

   @Override
   public Either<fig.b, fig.c> b() {
      return Either.right(new fig.c(this.c));
   }
}
