import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fhy(akf c) implements fhw {
   public static final MapCodec<fhy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akf.a.fieldOf("id").forGetter(fhy::c)).apply($$0, fhy::new));

   @Override
   public fhx a() {
      return fhx.e;
   }

   @Override
   public Either<fhw.b, fhw.c> b() {
      return Either.right(new fhw.c(this.c));
   }
}
