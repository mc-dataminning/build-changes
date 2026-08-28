import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record flo(akr c) implements flm {
   public static final MapCodec<flo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("id").forGetter(flo::c)).apply($$0, flo::new));

   @Override
   public fln a() {
      return fln.e;
   }

   @Override
   public Either<flm.b, flm.c> b() {
      return Either.right(new flm.c(this.c));
   }
}
