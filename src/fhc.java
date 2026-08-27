import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fhc(ajv c) implements fha {
   public static final MapCodec<fhc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajv.a.fieldOf("id").forGetter(fhc::c)).apply($$0, fhc::new));

   @Override
   public fhb a() {
      return fhb.e;
   }

   @Override
   public Either<fha.b, fha.c> b() {
      return Either.right(new fha.c(this.c));
   }
}
